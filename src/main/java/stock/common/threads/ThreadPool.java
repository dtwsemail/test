package stock.common.threads;

import com.google.common.util.concurrent.*;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by lemon on 10/5/16.
 */
public class ThreadPool {

   private static final  ListeningExecutorService service = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(50));

    public static <T> ListenableFuture submit(Callable<T> task) {
        ListenableFuture future1 = service.submit(new Callable<T>() {
            public T call() throws InterruptedException {
                try {
                    return task.call();
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
        });
        return future1;
    }

    public static void aWait(){
        try {
            service.awaitTermination(10, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void callback(ListenableFuture allFutures) {

        final ListenableFuture transform = Futures.transform(allFutures, new AsyncFunction<List<Integer>, Boolean>() {
            @Override
            public ListenableFuture apply(List<Integer> results) throws Exception {
                return Futures.immediateFuture(String.format("success future:%d", results.size()));
            }
        });

        Futures.addCallback(transform, new FutureCallback<Object>()

        {

            public void onSuccess(Object result) {
                System.out.println(result.getClass());
                System.out.printf("success with: %s%n", result);
            }

            public void onFailure(Throwable thrown) {
                System.out.printf("onFailure%s%n", thrown.getMessage());
            }
        });
    }
}

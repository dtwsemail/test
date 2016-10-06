package stock.common.cache;

import stock.common.constant.EnumLocalCache;
import stock.utils.AssertUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by lemon on 9/5/16.
 */
public class LocalCache<E> {

    private static final Map<EnumLocalCache, Object> totalMap = new HashMap<EnumLocalCache, Object>();
    public static final Object lock = new Object();


    public static final <E> ConcurrentHashMap<String, E> getInstance(EnumLocalCache key) {

        AssertUtil.assertNotNull(key, "Key can not be empty for Local Cache");

        ConcurrentHashMap<String, E> result = null;

        if (null == totalMap.get(key)) {
            synchronized (lock) {
                if (totalMap.get(key) == null) {
                    totalMap.put(key, new ConcurrentHashMap<String, E>());
                }
            }
        }

        return (ConcurrentHashMap<String, E>) totalMap.get(key);
    }

    public static final <E> E get(EnumLocalCache cacheKey, String key) {
        ConcurrentHashMap<String, E> map = getInstance(cacheKey);
        return map.get(key);
    }

    public static final <E> void put(EnumLocalCache cacheKey, String key, E value) {
        ConcurrentHashMap<String, E> map = getInstance(cacheKey);
        map.put(key, value);
    }

    public static boolean hitCache(EnumLocalCache cacheKey, String key) {
        ConcurrentHashMap map = getInstance(cacheKey);
        return map.get(key) != null;
    }


    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i= 0 ; i<10 ; i++){
            String key = Integer.valueOf(i).toString();
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println( Thread.currentThread().getName() + " previous : " +   LocalCache.get(EnumLocalCache.STOCK_CODE_CACHE,"abc"));
                    System.out.println(Thread.currentThread().getName() + "puting   " + key);
                    LocalCache.put(EnumLocalCache.STOCK_CODE_CACHE,"abc" , key);
                    System.out.println( Thread.currentThread().getName() + " after : " +   LocalCache.get(EnumLocalCache.STOCK_CODE_CACHE,"abc"));
                }
            });
        }
        try {
            service.awaitTermination(60, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LocalCache.getInstance(EnumLocalCache.STOCK_CODE_CACHE);
        System.out.println("i am end");

    }
}

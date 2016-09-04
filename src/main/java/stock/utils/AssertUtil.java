package stock.utils;

import com.google.common.base.Preconditions;

/**
 * Created by lemon on 9/4/16.
 */
public class AssertUtil {

    public static void assertTrue(boolean condition, String errorMsg) {
        Preconditions.checkState(condition, errorMsg);
    }

}

package stock.utils;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;

/**
 * Created by lemon on 10/5/16.
 */
public class NumberUtil {

    public final static BigDecimal parseBigDecimal(String text){

        if( StringUtils.isBlank(text) ){
            return null;
        }

        if(RegExpUtil.isNone(text)){
            return null;
        }

        return   new BigDecimal(text);
    }

    public static void main(String[] args) {
        System.out.println(parseBigDecimal("None"));

    }
}

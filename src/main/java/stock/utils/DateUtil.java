package stock.utils;

import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lemon on 9/4/16.
 */
public class DateUtil {

//    private final static SimpleDateFormat LINE_SPLIT_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public static Date getCurrentDate() {
        return new Date();
    }

    public static Date parseDate(String date){

        if(StringUtils.isBlank(date)){
            return null;
        }


        try {
            SimpleDateFormat LINE_SPLIT_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
            return LINE_SPLIT_FORMAT.parse(date);
        } catch (Exception e) {
            System.out.println("error:" + date);
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(parseDate("2016-09-30"));
    }
}

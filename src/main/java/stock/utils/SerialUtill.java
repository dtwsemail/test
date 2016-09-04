package stock.utils;

import java.util.UUID;

/**
 * Created by lemon on 9/4/16.
 */
public class SerialUtill {


    public static String generateSerialNo() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static void main(String[] args) {
        System.out.println(generateSerialNo());
    }
}

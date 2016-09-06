package stock.utils;

/**
 * Created by lemon on 9/5/16.
 */
public class StringUtil {


    public static String prefixByLength(int n, char prefix, int fixedLength) {
        if (n < 0 || fixedLength <= 0 || prefix < 0) {
            return null;
        }

        StringBuffer sb = new StringBuffer();
        String text = Integer.valueOf(n).toString();
        int length = text.length();
        while (length < fixedLength) {
            sb.append(prefix);
            length++;
        }
        return sb.append(text).toString();
    }

    public static void main(String[] args) {
        System.out.println(prefixByLength(44, '0', 3));
    }
}

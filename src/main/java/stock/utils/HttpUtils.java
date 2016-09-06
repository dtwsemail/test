package stock.utils;

import org.apache.commons.lang3.StringUtils;
import stock.common.exception.HttpException;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by SONY on 2016/8/28.
 */
public class HttpUtils {

    private static String getUrlParamStr(Map<String, String> param) {

        if (param != null) {
            StringBuffer sb = new StringBuffer();

            for (Map.Entry<String, String> entry : param.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (sb.length() != 0) {
                    sb.append(" & ");
                }
                sb.append(key).append(" = ").append(value);
            }

            if (sb.length() != 0) {
                return sb.insert(0, " ? ").toString();
            }
        }
        return StringUtils.EMPTY;
    }

    public static void main(String[] args) {
        Map<String, String> params = new HashMap<String, String>();

        params.put("test", "123");

        System.out.println(getUrlParamStr(params));

        String url = "http://quotes.money.163.com/service/chddata.html?code=0601398&start=20061027&end=20160828&fields=TCLOSE;HIGH;LOW;TOPEN;LCLOSE;CHG;PCHG;TURNOVER;VOTURNOVER;VATURNOVER;TCAP;MCAP";
        getFileFromUrl(url, "D:/test.cvs");
    }

    private static void getFileFromUrl(String url, String fileName) {
        FileOutputStream fos = null;
        BufferedInputStream in = null;
        try {
            fos = new FileOutputStream(fileName);
            URL realUrl = new URL(url);
            URLConnection connection = realUrl.openConnection();
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.connect();
            in = new BufferedInputStream(connection.getInputStream());
            byte[] cache = new byte[4096];

            int length = 0;
            int index = 0;
            while ((length = in.read(cache)) != -1) {
                fos.write(cache);
                index = index + length;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) fos.close();
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static final String sendGet(String baseUrl, Map<String, String> param) {
        String url = baseUrl + getUrlParamStr(param);
        return doGet(url);
    }

//    public static final String doGet(String url) {
//        BufferedReader in = null;
//
//        String content = null;
//        try {
//            HttpClient client = new DefaultHttpClient();
//            HttpGet request = new HttpGet();
//            request.setURI(new URI(url));
//            HttpResponse response = client.execute(request);
//
//            in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
//            StringBuffer sb = new StringBuffer();
//            String line;
//            while ((line = in.readLine()) != null) {
//                sb.append(line);
//            }
//            in.close();
//            content = sb.toString();
//        } finally {
//            if (in != null) {
//                try {
//                    in.close();// 最后要关闭BufferedReader
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//            return content;
//        }
//    }

    public static String doGet(String url) {
        String result = "";
        BufferedReader in = null;
        try {
            URL realUrl = new URL(url);
            URLConnection connection = realUrl.openConnection();
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.connect();
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            throw new HttpException("404", e);
        }
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }
}

package stock.utils;

import com.google.common.collect.Lists;
import stock.common.exception.FileParseException;

import java.io.*;
import java.util.Collections;
import java.util.List;

/**
 * Created by lemon on 10/5/16.
 */
public class FileUtil {

    public final static List<String> readFile(File file) {
        if (!file.exists()) {
            return Collections.emptyList();
        }

        BufferedReader reader = null;
        List<String> result = Lists.newArrayList();
        try {
            String line = null;
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
            while ((line = reader.readLine()) != null) {
                result.add(line);
            }
        } catch (Exception e) {
            throw new FileParseException(file, e);
        } finally {
            if (reader != null)
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return result;
    }

    public final static List<String> readFile(File file, int startIndex) {
        List<String> contentList = readFile(file);
        int size = contentList.size();
        return size > startIndex ? contentList.subList(startIndex, size) : Collections.emptyList();
    }


}

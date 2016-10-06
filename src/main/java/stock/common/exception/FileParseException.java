package stock.common.exception;

import java.io.File;

/**
 * Created by lemon on 10/5/16.
 */
public class FileParseException extends RuntimeException {

    public FileParseException(File file, Throwable cause) {
        super(file.getAbsoluteFile() + " parse error",cause);
    }

}

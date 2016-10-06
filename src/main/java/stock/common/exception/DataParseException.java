package stock.common.exception;

/**
 * Created by lemon on 10/5/16.
 */
public class DataParseException extends RuntimeException {

    public DataParseException(String line, Throwable cause) {
        super( line + " parse error",cause);
    }

    public DataParseException(String line) {
        super( line + " parse error");
    }
 
}

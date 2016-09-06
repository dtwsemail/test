package stock.common.exception;

/**
 * Created by lemon on 9/5/16.
 */
public class HttpException extends RuntimeException {

    private String statusCode;

    public HttpException(String statusCode, Throwable cause) {
        super(cause);
        this.statusCode = statusCode;
    }


    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}

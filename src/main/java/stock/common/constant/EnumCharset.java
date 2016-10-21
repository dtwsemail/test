package stock.common.constant;

/**
 * Created by SONY on 2016/10/21.
 */
public enum EnumCharset {

    GB2312("GB2312", "GB2312");

    private String code;
    private String description;

    EnumCharset(String code, String description) {
        this.code = code;
        this.description = description;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

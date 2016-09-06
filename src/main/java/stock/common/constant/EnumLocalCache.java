package stock.common.constant;

/**
 * Created by lemon on 9/5/16.
 */
public enum EnumLocalCache {

    STOCK_CODE_CACHE("STOCK_CODE_CACHE", "STOCK_CODE_CACHE");

    private String code;
    private String description;

    EnumLocalCache(String code, String description) {
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

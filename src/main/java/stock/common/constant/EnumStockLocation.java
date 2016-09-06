package stock.common.constant;

/**
 * Created by lemon on 9/5/16.
 */
public enum EnumStockLocation {

    SHANG_HAI("SH", "shang hai"), SHEN_ZHEN("SZ", "shen zhen");

    private String code;
    private String description;

    EnumStockLocation(String code, String description) {
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

package stock.common.constant;

/**
 * Created by lemon on 9/5/16.
 */
public enum EnumCrawerLogStatus {

    SUCCESS("SUCCESS", "success"), TIMEOUT("TIMEOUT", "TIMEOUT"), F0F("404", "404"), EXCEPTION("EXCEPTION", "parse data Exception"), ERROR("ERROR", "UNKNOW");

    private String code;
    private String description;

    EnumCrawerLogStatus(String code, String description) {
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

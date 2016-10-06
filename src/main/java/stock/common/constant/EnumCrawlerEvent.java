package stock.common.constant;

/**
 * Created by lemon on 9/5/16.
 */
public enum EnumCrawlerEvent {
    STOCK_CODE("STO_C", "STOCK_CODE"), STOCK_HISTORY("STO_H", "STOCK_HISTORY"),STOCK_HISTORY_PARSE("STO_H_P", "STOCK_HISTORY_PARSE");

    private String code;
    private String description;

    EnumCrawlerEvent(String code, String description) {
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

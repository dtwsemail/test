package stock.dal.model;

import java.math.BigDecimal;

public class FeatureRule {
    private String ruleId;

    private String ruleType;

    private BigDecimal bottomValue;

    private BigDecimal topValue;

    private String desc;

    private String stockCode;

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId == null ? null : ruleId.trim();
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType == null ? null : ruleType.trim();
    }

    public BigDecimal getBottomValue() {
        return bottomValue;
    }

    public void setBottomValue(BigDecimal bottomValue) {
        this.bottomValue = bottomValue;
    }

    public BigDecimal getTopValue() {
        return topValue;
    }

    public void setTopValue(BigDecimal topValue) {
        this.topValue = topValue;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }
}
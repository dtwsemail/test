package stock.dal.model;

public class StockFeature {
    private String featureId;

    private String baseFeatureId;

    private String newRuleId;

    private String desc;

    private Boolean isOrigin;

    public String getFeatureId() {
        return featureId;
    }

    public void setFeatureId(String featureId) {
        this.featureId = featureId == null ? null : featureId.trim();
    }

    public String getBaseFeatureId() {
        return baseFeatureId;
    }

    public void setBaseFeatureId(String baseFeatureId) {
        this.baseFeatureId = baseFeatureId == null ? null : baseFeatureId.trim();
    }

    public String getNewRuleId() {
        return newRuleId;
    }

    public void setNewRuleId(String newRuleId) {
        this.newRuleId = newRuleId == null ? null : newRuleId.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Boolean getIsOrigin() {
        return isOrigin;
    }

    public void setIsOrigin(Boolean isOrigin) {
        this.isOrigin = isOrigin;
    }
}
package stock.dal.model;

import java.math.BigDecimal;
import java.util.Date;

public class StockAnalyse {
    private String analyseId;

    private String stockCode;

    private BigDecimal sumShakeRate;

    private BigDecimal shakeDensity;

    private BigDecimal execpShakeRate;

    private String featureId;

    private Integer analyseDays;

    private String baseAnalyseId;

    private Integer sampleNum;

    private Integer analyseNum;

    private String featureBelongId;

    private String beginOrderId;

    private Date beginTradeDate;

    private BigDecimal endPrice;

    private BigDecimal topPrice;

    private BigDecimal bottomPrice;

    private BigDecimal beginPrice;

    private BigDecimal shakeRate;

    private BigDecimal turnRate;

    private BigDecimal tradeQuote;

    private BigDecimal tradeAmount;

    private Boolean isBroken;

    private Boolean isXd;

    public String getAnalyseId() {
        return analyseId;
    }

    public void setAnalyseId(String analyseId) {
        this.analyseId = analyseId == null ? null : analyseId.trim();
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public BigDecimal getSumShakeRate() {
        return sumShakeRate;
    }

    public void setSumShakeRate(BigDecimal sumShakeRate) {
        this.sumShakeRate = sumShakeRate;
    }

    public BigDecimal getShakeDensity() {
        return shakeDensity;
    }

    public void setShakeDensity(BigDecimal shakeDensity) {
        this.shakeDensity = shakeDensity;
    }

    public BigDecimal getExecpShakeRate() {
        return execpShakeRate;
    }

    public void setExecpShakeRate(BigDecimal execpShakeRate) {
        this.execpShakeRate = execpShakeRate;
    }

    public String getFeatureId() {
        return featureId;
    }

    public void setFeatureId(String featureId) {
        this.featureId = featureId == null ? null : featureId.trim();
    }

    public Integer getAnalyseDays() {
        return analyseDays;
    }

    public void setAnalyseDays(Integer analyseDays) {
        this.analyseDays = analyseDays;
    }

    public String getBaseAnalyseId() {
        return baseAnalyseId;
    }

    public void setBaseAnalyseId(String baseAnalyseId) {
        this.baseAnalyseId = baseAnalyseId == null ? null : baseAnalyseId.trim();
    }

    public Integer getSampleNum() {
        return sampleNum;
    }

    public void setSampleNum(Integer sampleNum) {
        this.sampleNum = sampleNum;
    }

    public Integer getAnalyseNum() {
        return analyseNum;
    }

    public void setAnalyseNum(Integer analyseNum) {
        this.analyseNum = analyseNum;
    }

    public String getFeatureBelongId() {
        return featureBelongId;
    }

    public void setFeatureBelongId(String featureBelongId) {
        this.featureBelongId = featureBelongId == null ? null : featureBelongId.trim();
    }

    public String getBeginOrderId() {
        return beginOrderId;
    }

    public void setBeginOrderId(String beginOrderId) {
        this.beginOrderId = beginOrderId == null ? null : beginOrderId.trim();
    }

    public Date getBeginTradeDate() {
        return beginTradeDate;
    }

    public void setBeginTradeDate(Date beginTradeDate) {
        this.beginTradeDate = beginTradeDate;
    }

    public BigDecimal getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(BigDecimal endPrice) {
        this.endPrice = endPrice;
    }

    public BigDecimal getTopPrice() {
        return topPrice;
    }

    public void setTopPrice(BigDecimal topPrice) {
        this.topPrice = topPrice;
    }

    public BigDecimal getBottomPrice() {
        return bottomPrice;
    }

    public void setBottomPrice(BigDecimal bottomPrice) {
        this.bottomPrice = bottomPrice;
    }

    public BigDecimal getBeginPrice() {
        return beginPrice;
    }

    public void setBeginPrice(BigDecimal beginPrice) {
        this.beginPrice = beginPrice;
    }

    public BigDecimal getShakeRate() {
        return shakeRate;
    }

    public void setShakeRate(BigDecimal shakeRate) {
        this.shakeRate = shakeRate;
    }

    public BigDecimal getTurnRate() {
        return turnRate;
    }

    public void setTurnRate(BigDecimal turnRate) {
        this.turnRate = turnRate;
    }

    public BigDecimal getTradeQuote() {
        return tradeQuote;
    }

    public void setTradeQuote(BigDecimal tradeQuote) {
        this.tradeQuote = tradeQuote;
    }

    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public Boolean getIsBroken() {
        return isBroken;
    }

    public void setIsBroken(Boolean isBroken) {
        this.isBroken = isBroken;
    }

    public Boolean getIsXd() {
        return isXd;
    }

    public void setIsXd(Boolean isXd) {
        this.isXd = isXd;
    }
}
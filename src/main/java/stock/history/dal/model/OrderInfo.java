package stock.history.dal.model;

import java.math.BigDecimal;
import java.util.Date;

public class OrderInfo {
    private String orderId;

    private Date tradeDate;

    private String stockId;

    private BigDecimal endPrice;

    private BigDecimal topPrice;

    private BigDecimal beginPrice;

    private BigDecimal previousPrice;

    private BigDecimal shakePrice;

    private Integer shakeRate;

    private BigDecimal turnRate;

    private Long tradeQuote;

    private Long tradeAmount;

    private Long totalAmount;

    private Long unfrozenAmount;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId == null ? null : stockId.trim();
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

    public BigDecimal getBeginPrice() {
        return beginPrice;
    }

    public void setBeginPrice(BigDecimal beginPrice) {
        this.beginPrice = beginPrice;
    }

    public BigDecimal getPreviousPrice() {
        return previousPrice;
    }

    public void setPreviousPrice(BigDecimal previousPrice) {
        this.previousPrice = previousPrice;
    }

    public BigDecimal getShakePrice() {
        return shakePrice;
    }

    public void setShakePrice(BigDecimal shakePrice) {
        this.shakePrice = shakePrice;
    }

    public Integer getShakeRate() {
        return shakeRate;
    }

    public void setShakeRate(Integer shakeRate) {
        this.shakeRate = shakeRate;
    }

    public BigDecimal getTurnRate() {
        return turnRate;
    }

    public void setTurnRate(BigDecimal turnRate) {
        this.turnRate = turnRate;
    }

    public Long getTradeQuote() {
        return tradeQuote;
    }

    public void setTradeQuote(Long tradeQuote) {
        this.tradeQuote = tradeQuote;
    }

    public Long getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Long tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getUnfrozenAmount() {
        return unfrozenAmount;
    }

    public void setUnfrozenAmount(Long unfrozenAmount) {
        this.unfrozenAmount = unfrozenAmount;
    }
}
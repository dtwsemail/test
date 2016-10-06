package stock.history.dal.model;

import java.math.BigDecimal;
import java.util.Date;

public class OrderInfo {
    private String orderId;

    private Date tradeDate;

    private String stockId;

    private BigDecimal endPrice;

    private BigDecimal topPrice;

    private BigDecimal bottomPrice;

    private BigDecimal beginPrice;

    private BigDecimal previousPrice;

    private BigDecimal shakePrice;

    private BigDecimal shakeRate;

    private BigDecimal turnRate;

    private BigDecimal tradeQuote;

    private BigDecimal tradeAmount;

    private BigDecimal totalAmount;

    private BigDecimal unfrozenAmount;

    private BigDecimal tradeNumber;

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

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getUnfrozenAmount() {
        return unfrozenAmount;
    }

    public void setUnfrozenAmount(BigDecimal unfrozenAmount) {
        this.unfrozenAmount = unfrozenAmount;
    }

    public BigDecimal getTradeNumber() {
        return tradeNumber;
    }

    public void setTradeNumber(BigDecimal tradeNumber) {
        this.tradeNumber = tradeNumber;
    }
}
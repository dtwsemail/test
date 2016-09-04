package stock.history.dal.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNull() {
            addCriterion("trade_date is null");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNotNull() {
            addCriterion("trade_date is not null");
            return (Criteria) this;
        }

        public Criteria andTradeDateEqualTo(Date value) {
            addCriterionForJDBCDate("trade_date =", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("trade_date <>", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("trade_date >", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trade_date >=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThan(Date value) {
            addCriterionForJDBCDate("trade_date <", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trade_date <=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateIn(List<Date> values) {
            addCriterionForJDBCDate("trade_date in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("trade_date not in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trade_date between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trade_date not between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNull() {
            addCriterion("stock_id is null");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNotNull() {
            addCriterion("stock_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockIdEqualTo(String value) {
            addCriterion("stock_id =", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotEqualTo(String value) {
            addCriterion("stock_id <>", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThan(String value) {
            addCriterion("stock_id >", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThanOrEqualTo(String value) {
            addCriterion("stock_id >=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThan(String value) {
            addCriterion("stock_id <", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThanOrEqualTo(String value) {
            addCriterion("stock_id <=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLike(String value) {
            addCriterion("stock_id like", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotLike(String value) {
            addCriterion("stock_id not like", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdIn(List<String> values) {
            addCriterion("stock_id in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotIn(List<String> values) {
            addCriterion("stock_id not in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdBetween(String value1, String value2) {
            addCriterion("stock_id between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotBetween(String value1, String value2) {
            addCriterion("stock_id not between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andEndPriceIsNull() {
            addCriterion("end_price is null");
            return (Criteria) this;
        }

        public Criteria andEndPriceIsNotNull() {
            addCriterion("end_price is not null");
            return (Criteria) this;
        }

        public Criteria andEndPriceEqualTo(BigDecimal value) {
            addCriterion("end_price =", value, "endPrice");
            return (Criteria) this;
        }

        public Criteria andEndPriceNotEqualTo(BigDecimal value) {
            addCriterion("end_price <>", value, "endPrice");
            return (Criteria) this;
        }

        public Criteria andEndPriceGreaterThan(BigDecimal value) {
            addCriterion("end_price >", value, "endPrice");
            return (Criteria) this;
        }

        public Criteria andEndPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("end_price >=", value, "endPrice");
            return (Criteria) this;
        }

        public Criteria andEndPriceLessThan(BigDecimal value) {
            addCriterion("end_price <", value, "endPrice");
            return (Criteria) this;
        }

        public Criteria andEndPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("end_price <=", value, "endPrice");
            return (Criteria) this;
        }

        public Criteria andEndPriceIn(List<BigDecimal> values) {
            addCriterion("end_price in", values, "endPrice");
            return (Criteria) this;
        }

        public Criteria andEndPriceNotIn(List<BigDecimal> values) {
            addCriterion("end_price not in", values, "endPrice");
            return (Criteria) this;
        }

        public Criteria andEndPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("end_price between", value1, value2, "endPrice");
            return (Criteria) this;
        }

        public Criteria andEndPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("end_price not between", value1, value2, "endPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceIsNull() {
            addCriterion("top_price is null");
            return (Criteria) this;
        }

        public Criteria andTopPriceIsNotNull() {
            addCriterion("top_price is not null");
            return (Criteria) this;
        }

        public Criteria andTopPriceEqualTo(BigDecimal value) {
            addCriterion("top_price =", value, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceNotEqualTo(BigDecimal value) {
            addCriterion("top_price <>", value, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceGreaterThan(BigDecimal value) {
            addCriterion("top_price >", value, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("top_price >=", value, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceLessThan(BigDecimal value) {
            addCriterion("top_price <", value, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("top_price <=", value, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceIn(List<BigDecimal> values) {
            addCriterion("top_price in", values, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceNotIn(List<BigDecimal> values) {
            addCriterion("top_price not in", values, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("top_price between", value1, value2, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("top_price not between", value1, value2, "topPrice");
            return (Criteria) this;
        }

        public Criteria andBeginPriceIsNull() {
            addCriterion("begin_price is null");
            return (Criteria) this;
        }

        public Criteria andBeginPriceIsNotNull() {
            addCriterion("begin_price is not null");
            return (Criteria) this;
        }

        public Criteria andBeginPriceEqualTo(BigDecimal value) {
            addCriterion("begin_price =", value, "beginPrice");
            return (Criteria) this;
        }

        public Criteria andBeginPriceNotEqualTo(BigDecimal value) {
            addCriterion("begin_price <>", value, "beginPrice");
            return (Criteria) this;
        }

        public Criteria andBeginPriceGreaterThan(BigDecimal value) {
            addCriterion("begin_price >", value, "beginPrice");
            return (Criteria) this;
        }

        public Criteria andBeginPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("begin_price >=", value, "beginPrice");
            return (Criteria) this;
        }

        public Criteria andBeginPriceLessThan(BigDecimal value) {
            addCriterion("begin_price <", value, "beginPrice");
            return (Criteria) this;
        }

        public Criteria andBeginPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("begin_price <=", value, "beginPrice");
            return (Criteria) this;
        }

        public Criteria andBeginPriceIn(List<BigDecimal> values) {
            addCriterion("begin_price in", values, "beginPrice");
            return (Criteria) this;
        }

        public Criteria andBeginPriceNotIn(List<BigDecimal> values) {
            addCriterion("begin_price not in", values, "beginPrice");
            return (Criteria) this;
        }

        public Criteria andBeginPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("begin_price between", value1, value2, "beginPrice");
            return (Criteria) this;
        }

        public Criteria andBeginPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("begin_price not between", value1, value2, "beginPrice");
            return (Criteria) this;
        }

        public Criteria andPreviousPriceIsNull() {
            addCriterion("previous_price is null");
            return (Criteria) this;
        }

        public Criteria andPreviousPriceIsNotNull() {
            addCriterion("previous_price is not null");
            return (Criteria) this;
        }

        public Criteria andPreviousPriceEqualTo(BigDecimal value) {
            addCriterion("previous_price =", value, "previousPrice");
            return (Criteria) this;
        }

        public Criteria andPreviousPriceNotEqualTo(BigDecimal value) {
            addCriterion("previous_price <>", value, "previousPrice");
            return (Criteria) this;
        }

        public Criteria andPreviousPriceGreaterThan(BigDecimal value) {
            addCriterion("previous_price >", value, "previousPrice");
            return (Criteria) this;
        }

        public Criteria andPreviousPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("previous_price >=", value, "previousPrice");
            return (Criteria) this;
        }

        public Criteria andPreviousPriceLessThan(BigDecimal value) {
            addCriterion("previous_price <", value, "previousPrice");
            return (Criteria) this;
        }

        public Criteria andPreviousPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("previous_price <=", value, "previousPrice");
            return (Criteria) this;
        }

        public Criteria andPreviousPriceIn(List<BigDecimal> values) {
            addCriterion("previous_price in", values, "previousPrice");
            return (Criteria) this;
        }

        public Criteria andPreviousPriceNotIn(List<BigDecimal> values) {
            addCriterion("previous_price not in", values, "previousPrice");
            return (Criteria) this;
        }

        public Criteria andPreviousPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("previous_price between", value1, value2, "previousPrice");
            return (Criteria) this;
        }

        public Criteria andPreviousPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("previous_price not between", value1, value2, "previousPrice");
            return (Criteria) this;
        }

        public Criteria andShakePriceIsNull() {
            addCriterion("shake_price is null");
            return (Criteria) this;
        }

        public Criteria andShakePriceIsNotNull() {
            addCriterion("shake_price is not null");
            return (Criteria) this;
        }

        public Criteria andShakePriceEqualTo(BigDecimal value) {
            addCriterion("shake_price =", value, "shakePrice");
            return (Criteria) this;
        }

        public Criteria andShakePriceNotEqualTo(BigDecimal value) {
            addCriterion("shake_price <>", value, "shakePrice");
            return (Criteria) this;
        }

        public Criteria andShakePriceGreaterThan(BigDecimal value) {
            addCriterion("shake_price >", value, "shakePrice");
            return (Criteria) this;
        }

        public Criteria andShakePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shake_price >=", value, "shakePrice");
            return (Criteria) this;
        }

        public Criteria andShakePriceLessThan(BigDecimal value) {
            addCriterion("shake_price <", value, "shakePrice");
            return (Criteria) this;
        }

        public Criteria andShakePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shake_price <=", value, "shakePrice");
            return (Criteria) this;
        }

        public Criteria andShakePriceIn(List<BigDecimal> values) {
            addCriterion("shake_price in", values, "shakePrice");
            return (Criteria) this;
        }

        public Criteria andShakePriceNotIn(List<BigDecimal> values) {
            addCriterion("shake_price not in", values, "shakePrice");
            return (Criteria) this;
        }

        public Criteria andShakePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shake_price between", value1, value2, "shakePrice");
            return (Criteria) this;
        }

        public Criteria andShakePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shake_price not between", value1, value2, "shakePrice");
            return (Criteria) this;
        }

        public Criteria andShakeRateIsNull() {
            addCriterion("shake_rate is null");
            return (Criteria) this;
        }

        public Criteria andShakeRateIsNotNull() {
            addCriterion("shake_rate is not null");
            return (Criteria) this;
        }

        public Criteria andShakeRateEqualTo(Integer value) {
            addCriterion("shake_rate =", value, "shakeRate");
            return (Criteria) this;
        }

        public Criteria andShakeRateNotEqualTo(Integer value) {
            addCriterion("shake_rate <>", value, "shakeRate");
            return (Criteria) this;
        }

        public Criteria andShakeRateGreaterThan(Integer value) {
            addCriterion("shake_rate >", value, "shakeRate");
            return (Criteria) this;
        }

        public Criteria andShakeRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("shake_rate >=", value, "shakeRate");
            return (Criteria) this;
        }

        public Criteria andShakeRateLessThan(Integer value) {
            addCriterion("shake_rate <", value, "shakeRate");
            return (Criteria) this;
        }

        public Criteria andShakeRateLessThanOrEqualTo(Integer value) {
            addCriterion("shake_rate <=", value, "shakeRate");
            return (Criteria) this;
        }

        public Criteria andShakeRateIn(List<Integer> values) {
            addCriterion("shake_rate in", values, "shakeRate");
            return (Criteria) this;
        }

        public Criteria andShakeRateNotIn(List<Integer> values) {
            addCriterion("shake_rate not in", values, "shakeRate");
            return (Criteria) this;
        }

        public Criteria andShakeRateBetween(Integer value1, Integer value2) {
            addCriterion("shake_rate between", value1, value2, "shakeRate");
            return (Criteria) this;
        }

        public Criteria andShakeRateNotBetween(Integer value1, Integer value2) {
            addCriterion("shake_rate not between", value1, value2, "shakeRate");
            return (Criteria) this;
        }

        public Criteria andTurnRateIsNull() {
            addCriterion("turn_rate is null");
            return (Criteria) this;
        }

        public Criteria andTurnRateIsNotNull() {
            addCriterion("turn_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTurnRateEqualTo(BigDecimal value) {
            addCriterion("turn_rate =", value, "turnRate");
            return (Criteria) this;
        }

        public Criteria andTurnRateNotEqualTo(BigDecimal value) {
            addCriterion("turn_rate <>", value, "turnRate");
            return (Criteria) this;
        }

        public Criteria andTurnRateGreaterThan(BigDecimal value) {
            addCriterion("turn_rate >", value, "turnRate");
            return (Criteria) this;
        }

        public Criteria andTurnRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("turn_rate >=", value, "turnRate");
            return (Criteria) this;
        }

        public Criteria andTurnRateLessThan(BigDecimal value) {
            addCriterion("turn_rate <", value, "turnRate");
            return (Criteria) this;
        }

        public Criteria andTurnRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("turn_rate <=", value, "turnRate");
            return (Criteria) this;
        }

        public Criteria andTurnRateIn(List<BigDecimal> values) {
            addCriterion("turn_rate in", values, "turnRate");
            return (Criteria) this;
        }

        public Criteria andTurnRateNotIn(List<BigDecimal> values) {
            addCriterion("turn_rate not in", values, "turnRate");
            return (Criteria) this;
        }

        public Criteria andTurnRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("turn_rate between", value1, value2, "turnRate");
            return (Criteria) this;
        }

        public Criteria andTurnRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("turn_rate not between", value1, value2, "turnRate");
            return (Criteria) this;
        }

        public Criteria andTradeQuoteIsNull() {
            addCriterion("trade_quote is null");
            return (Criteria) this;
        }

        public Criteria andTradeQuoteIsNotNull() {
            addCriterion("trade_quote is not null");
            return (Criteria) this;
        }

        public Criteria andTradeQuoteEqualTo(Long value) {
            addCriterion("trade_quote =", value, "tradeQuote");
            return (Criteria) this;
        }

        public Criteria andTradeQuoteNotEqualTo(Long value) {
            addCriterion("trade_quote <>", value, "tradeQuote");
            return (Criteria) this;
        }

        public Criteria andTradeQuoteGreaterThan(Long value) {
            addCriterion("trade_quote >", value, "tradeQuote");
            return (Criteria) this;
        }

        public Criteria andTradeQuoteGreaterThanOrEqualTo(Long value) {
            addCriterion("trade_quote >=", value, "tradeQuote");
            return (Criteria) this;
        }

        public Criteria andTradeQuoteLessThan(Long value) {
            addCriterion("trade_quote <", value, "tradeQuote");
            return (Criteria) this;
        }

        public Criteria andTradeQuoteLessThanOrEqualTo(Long value) {
            addCriterion("trade_quote <=", value, "tradeQuote");
            return (Criteria) this;
        }

        public Criteria andTradeQuoteIn(List<Long> values) {
            addCriterion("trade_quote in", values, "tradeQuote");
            return (Criteria) this;
        }

        public Criteria andTradeQuoteNotIn(List<Long> values) {
            addCriterion("trade_quote not in", values, "tradeQuote");
            return (Criteria) this;
        }

        public Criteria andTradeQuoteBetween(Long value1, Long value2) {
            addCriterion("trade_quote between", value1, value2, "tradeQuote");
            return (Criteria) this;
        }

        public Criteria andTradeQuoteNotBetween(Long value1, Long value2) {
            addCriterion("trade_quote not between", value1, value2, "tradeQuote");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIsNull() {
            addCriterion("trade_amount is null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIsNotNull() {
            addCriterion("trade_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountEqualTo(Long value) {
            addCriterion("trade_amount =", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotEqualTo(Long value) {
            addCriterion("trade_amount <>", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThan(Long value) {
            addCriterion("trade_amount >", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("trade_amount >=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThan(Long value) {
            addCriterion("trade_amount <", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThanOrEqualTo(Long value) {
            addCriterion("trade_amount <=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIn(List<Long> values) {
            addCriterion("trade_amount in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotIn(List<Long> values) {
            addCriterion("trade_amount not in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountBetween(Long value1, Long value2) {
            addCriterion("trade_amount between", value1, value2, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotBetween(Long value1, Long value2) {
            addCriterion("trade_amount not between", value1, value2, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(Long value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(Long value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(Long value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(Long value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(Long value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<Long> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<Long> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(Long value1, Long value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(Long value1, Long value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andUnfrozenAmountIsNull() {
            addCriterion("unfrozen_amount is null");
            return (Criteria) this;
        }

        public Criteria andUnfrozenAmountIsNotNull() {
            addCriterion("unfrozen_amount is not null");
            return (Criteria) this;
        }

        public Criteria andUnfrozenAmountEqualTo(Long value) {
            addCriterion("unfrozen_amount =", value, "unfrozenAmount");
            return (Criteria) this;
        }

        public Criteria andUnfrozenAmountNotEqualTo(Long value) {
            addCriterion("unfrozen_amount <>", value, "unfrozenAmount");
            return (Criteria) this;
        }

        public Criteria andUnfrozenAmountGreaterThan(Long value) {
            addCriterion("unfrozen_amount >", value, "unfrozenAmount");
            return (Criteria) this;
        }

        public Criteria andUnfrozenAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("unfrozen_amount >=", value, "unfrozenAmount");
            return (Criteria) this;
        }

        public Criteria andUnfrozenAmountLessThan(Long value) {
            addCriterion("unfrozen_amount <", value, "unfrozenAmount");
            return (Criteria) this;
        }

        public Criteria andUnfrozenAmountLessThanOrEqualTo(Long value) {
            addCriterion("unfrozen_amount <=", value, "unfrozenAmount");
            return (Criteria) this;
        }

        public Criteria andUnfrozenAmountIn(List<Long> values) {
            addCriterion("unfrozen_amount in", values, "unfrozenAmount");
            return (Criteria) this;
        }

        public Criteria andUnfrozenAmountNotIn(List<Long> values) {
            addCriterion("unfrozen_amount not in", values, "unfrozenAmount");
            return (Criteria) this;
        }

        public Criteria andUnfrozenAmountBetween(Long value1, Long value2) {
            addCriterion("unfrozen_amount between", value1, value2, "unfrozenAmount");
            return (Criteria) this;
        }

        public Criteria andUnfrozenAmountNotBetween(Long value1, Long value2) {
            addCriterion("unfrozen_amount not between", value1, value2, "unfrozenAmount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
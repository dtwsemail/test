package stock.dal.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StockAnalyseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockAnalyseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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

        public Criteria andAnalyseIdIsNull() {
            addCriterion("analyse_id is null");
            return (Criteria) this;
        }

        public Criteria andAnalyseIdIsNotNull() {
            addCriterion("analyse_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnalyseIdEqualTo(String value) {
            addCriterion("analyse_id =", value, "analyseId");
            return (Criteria) this;
        }

        public Criteria andAnalyseIdNotEqualTo(String value) {
            addCriterion("analyse_id <>", value, "analyseId");
            return (Criteria) this;
        }

        public Criteria andAnalyseIdGreaterThan(String value) {
            addCriterion("analyse_id >", value, "analyseId");
            return (Criteria) this;
        }

        public Criteria andAnalyseIdGreaterThanOrEqualTo(String value) {
            addCriterion("analyse_id >=", value, "analyseId");
            return (Criteria) this;
        }

        public Criteria andAnalyseIdLessThan(String value) {
            addCriterion("analyse_id <", value, "analyseId");
            return (Criteria) this;
        }

        public Criteria andAnalyseIdLessThanOrEqualTo(String value) {
            addCriterion("analyse_id <=", value, "analyseId");
            return (Criteria) this;
        }

        public Criteria andAnalyseIdLike(String value) {
            addCriterion("analyse_id like", value, "analyseId");
            return (Criteria) this;
        }

        public Criteria andAnalyseIdNotLike(String value) {
            addCriterion("analyse_id not like", value, "analyseId");
            return (Criteria) this;
        }

        public Criteria andAnalyseIdIn(List<String> values) {
            addCriterion("analyse_id in", values, "analyseId");
            return (Criteria) this;
        }

        public Criteria andAnalyseIdNotIn(List<String> values) {
            addCriterion("analyse_id not in", values, "analyseId");
            return (Criteria) this;
        }

        public Criteria andAnalyseIdBetween(String value1, String value2) {
            addCriterion("analyse_id between", value1, value2, "analyseId");
            return (Criteria) this;
        }

        public Criteria andAnalyseIdNotBetween(String value1, String value2) {
            addCriterion("analyse_id not between", value1, value2, "analyseId");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNull() {
            addCriterion("stock_code is null");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNotNull() {
            addCriterion("stock_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockCodeEqualTo(String value) {
            addCriterion("stock_code =", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotEqualTo(String value) {
            addCriterion("stock_code <>", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThan(String value) {
            addCriterion("stock_code >", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_code >=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThan(String value) {
            addCriterion("stock_code <", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanOrEqualTo(String value) {
            addCriterion("stock_code <=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLike(String value) {
            addCriterion("stock_code like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotLike(String value) {
            addCriterion("stock_code not like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeIn(List<String> values) {
            addCriterion("stock_code in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotIn(List<String> values) {
            addCriterion("stock_code not in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeBetween(String value1, String value2) {
            addCriterion("stock_code between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotBetween(String value1, String value2) {
            addCriterion("stock_code not between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andSumShakeRateIsNull() {
            addCriterion("sum_shake_rate is null");
            return (Criteria) this;
        }

        public Criteria andSumShakeRateIsNotNull() {
            addCriterion("sum_shake_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSumShakeRateEqualTo(BigDecimal value) {
            addCriterion("sum_shake_rate =", value, "sumShakeRate");
            return (Criteria) this;
        }

        public Criteria andSumShakeRateNotEqualTo(BigDecimal value) {
            addCriterion("sum_shake_rate <>", value, "sumShakeRate");
            return (Criteria) this;
        }

        public Criteria andSumShakeRateGreaterThan(BigDecimal value) {
            addCriterion("sum_shake_rate >", value, "sumShakeRate");
            return (Criteria) this;
        }

        public Criteria andSumShakeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_shake_rate >=", value, "sumShakeRate");
            return (Criteria) this;
        }

        public Criteria andSumShakeRateLessThan(BigDecimal value) {
            addCriterion("sum_shake_rate <", value, "sumShakeRate");
            return (Criteria) this;
        }

        public Criteria andSumShakeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_shake_rate <=", value, "sumShakeRate");
            return (Criteria) this;
        }

        public Criteria andSumShakeRateIn(List<BigDecimal> values) {
            addCriterion("sum_shake_rate in", values, "sumShakeRate");
            return (Criteria) this;
        }

        public Criteria andSumShakeRateNotIn(List<BigDecimal> values) {
            addCriterion("sum_shake_rate not in", values, "sumShakeRate");
            return (Criteria) this;
        }

        public Criteria andSumShakeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_shake_rate between", value1, value2, "sumShakeRate");
            return (Criteria) this;
        }

        public Criteria andSumShakeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_shake_rate not between", value1, value2, "sumShakeRate");
            return (Criteria) this;
        }

        public Criteria andShakeDensityIsNull() {
            addCriterion("shake_density is null");
            return (Criteria) this;
        }

        public Criteria andShakeDensityIsNotNull() {
            addCriterion("shake_density is not null");
            return (Criteria) this;
        }

        public Criteria andShakeDensityEqualTo(BigDecimal value) {
            addCriterion("shake_density =", value, "shakeDensity");
            return (Criteria) this;
        }

        public Criteria andShakeDensityNotEqualTo(BigDecimal value) {
            addCriterion("shake_density <>", value, "shakeDensity");
            return (Criteria) this;
        }

        public Criteria andShakeDensityGreaterThan(BigDecimal value) {
            addCriterion("shake_density >", value, "shakeDensity");
            return (Criteria) this;
        }

        public Criteria andShakeDensityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shake_density >=", value, "shakeDensity");
            return (Criteria) this;
        }

        public Criteria andShakeDensityLessThan(BigDecimal value) {
            addCriterion("shake_density <", value, "shakeDensity");
            return (Criteria) this;
        }

        public Criteria andShakeDensityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shake_density <=", value, "shakeDensity");
            return (Criteria) this;
        }

        public Criteria andShakeDensityIn(List<BigDecimal> values) {
            addCriterion("shake_density in", values, "shakeDensity");
            return (Criteria) this;
        }

        public Criteria andShakeDensityNotIn(List<BigDecimal> values) {
            addCriterion("shake_density not in", values, "shakeDensity");
            return (Criteria) this;
        }

        public Criteria andShakeDensityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shake_density between", value1, value2, "shakeDensity");
            return (Criteria) this;
        }

        public Criteria andShakeDensityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shake_density not between", value1, value2, "shakeDensity");
            return (Criteria) this;
        }

        public Criteria andExecpShakeRateIsNull() {
            addCriterion("execp_shake_rate is null");
            return (Criteria) this;
        }

        public Criteria andExecpShakeRateIsNotNull() {
            addCriterion("execp_shake_rate is not null");
            return (Criteria) this;
        }

        public Criteria andExecpShakeRateEqualTo(BigDecimal value) {
            addCriterion("execp_shake_rate =", value, "execpShakeRate");
            return (Criteria) this;
        }

        public Criteria andExecpShakeRateNotEqualTo(BigDecimal value) {
            addCriterion("execp_shake_rate <>", value, "execpShakeRate");
            return (Criteria) this;
        }

        public Criteria andExecpShakeRateGreaterThan(BigDecimal value) {
            addCriterion("execp_shake_rate >", value, "execpShakeRate");
            return (Criteria) this;
        }

        public Criteria andExecpShakeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("execp_shake_rate >=", value, "execpShakeRate");
            return (Criteria) this;
        }

        public Criteria andExecpShakeRateLessThan(BigDecimal value) {
            addCriterion("execp_shake_rate <", value, "execpShakeRate");
            return (Criteria) this;
        }

        public Criteria andExecpShakeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("execp_shake_rate <=", value, "execpShakeRate");
            return (Criteria) this;
        }

        public Criteria andExecpShakeRateIn(List<BigDecimal> values) {
            addCriterion("execp_shake_rate in", values, "execpShakeRate");
            return (Criteria) this;
        }

        public Criteria andExecpShakeRateNotIn(List<BigDecimal> values) {
            addCriterion("execp_shake_rate not in", values, "execpShakeRate");
            return (Criteria) this;
        }

        public Criteria andExecpShakeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("execp_shake_rate between", value1, value2, "execpShakeRate");
            return (Criteria) this;
        }

        public Criteria andExecpShakeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("execp_shake_rate not between", value1, value2, "execpShakeRate");
            return (Criteria) this;
        }

        public Criteria andFeatureIdIsNull() {
            addCriterion("feature_id is null");
            return (Criteria) this;
        }

        public Criteria andFeatureIdIsNotNull() {
            addCriterion("feature_id is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureIdEqualTo(String value) {
            addCriterion("feature_id =", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdNotEqualTo(String value) {
            addCriterion("feature_id <>", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdGreaterThan(String value) {
            addCriterion("feature_id >", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdGreaterThanOrEqualTo(String value) {
            addCriterion("feature_id >=", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdLessThan(String value) {
            addCriterion("feature_id <", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdLessThanOrEqualTo(String value) {
            addCriterion("feature_id <=", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdLike(String value) {
            addCriterion("feature_id like", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdNotLike(String value) {
            addCriterion("feature_id not like", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdIn(List<String> values) {
            addCriterion("feature_id in", values, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdNotIn(List<String> values) {
            addCriterion("feature_id not in", values, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdBetween(String value1, String value2) {
            addCriterion("feature_id between", value1, value2, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdNotBetween(String value1, String value2) {
            addCriterion("feature_id not between", value1, value2, "featureId");
            return (Criteria) this;
        }

        public Criteria andAnalyseDaysIsNull() {
            addCriterion("analyse_days is null");
            return (Criteria) this;
        }

        public Criteria andAnalyseDaysIsNotNull() {
            addCriterion("analyse_days is not null");
            return (Criteria) this;
        }

        public Criteria andAnalyseDaysEqualTo(Integer value) {
            addCriterion("analyse_days =", value, "analyseDays");
            return (Criteria) this;
        }

        public Criteria andAnalyseDaysNotEqualTo(Integer value) {
            addCriterion("analyse_days <>", value, "analyseDays");
            return (Criteria) this;
        }

        public Criteria andAnalyseDaysGreaterThan(Integer value) {
            addCriterion("analyse_days >", value, "analyseDays");
            return (Criteria) this;
        }

        public Criteria andAnalyseDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("analyse_days >=", value, "analyseDays");
            return (Criteria) this;
        }

        public Criteria andAnalyseDaysLessThan(Integer value) {
            addCriterion("analyse_days <", value, "analyseDays");
            return (Criteria) this;
        }

        public Criteria andAnalyseDaysLessThanOrEqualTo(Integer value) {
            addCriterion("analyse_days <=", value, "analyseDays");
            return (Criteria) this;
        }

        public Criteria andAnalyseDaysIn(List<Integer> values) {
            addCriterion("analyse_days in", values, "analyseDays");
            return (Criteria) this;
        }

        public Criteria andAnalyseDaysNotIn(List<Integer> values) {
            addCriterion("analyse_days not in", values, "analyseDays");
            return (Criteria) this;
        }

        public Criteria andAnalyseDaysBetween(Integer value1, Integer value2) {
            addCriterion("analyse_days between", value1, value2, "analyseDays");
            return (Criteria) this;
        }

        public Criteria andAnalyseDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("analyse_days not between", value1, value2, "analyseDays");
            return (Criteria) this;
        }

        public Criteria andBaseAnalyseIdIsNull() {
            addCriterion("base_analyse_id is null");
            return (Criteria) this;
        }

        public Criteria andBaseAnalyseIdIsNotNull() {
            addCriterion("base_analyse_id is not null");
            return (Criteria) this;
        }

        public Criteria andBaseAnalyseIdEqualTo(String value) {
            addCriterion("base_analyse_id =", value, "baseAnalyseId");
            return (Criteria) this;
        }

        public Criteria andBaseAnalyseIdNotEqualTo(String value) {
            addCriterion("base_analyse_id <>", value, "baseAnalyseId");
            return (Criteria) this;
        }

        public Criteria andBaseAnalyseIdGreaterThan(String value) {
            addCriterion("base_analyse_id >", value, "baseAnalyseId");
            return (Criteria) this;
        }

        public Criteria andBaseAnalyseIdGreaterThanOrEqualTo(String value) {
            addCriterion("base_analyse_id >=", value, "baseAnalyseId");
            return (Criteria) this;
        }

        public Criteria andBaseAnalyseIdLessThan(String value) {
            addCriterion("base_analyse_id <", value, "baseAnalyseId");
            return (Criteria) this;
        }

        public Criteria andBaseAnalyseIdLessThanOrEqualTo(String value) {
            addCriterion("base_analyse_id <=", value, "baseAnalyseId");
            return (Criteria) this;
        }

        public Criteria andBaseAnalyseIdLike(String value) {
            addCriterion("base_analyse_id like", value, "baseAnalyseId");
            return (Criteria) this;
        }

        public Criteria andBaseAnalyseIdNotLike(String value) {
            addCriterion("base_analyse_id not like", value, "baseAnalyseId");
            return (Criteria) this;
        }

        public Criteria andBaseAnalyseIdIn(List<String> values) {
            addCriterion("base_analyse_id in", values, "baseAnalyseId");
            return (Criteria) this;
        }

        public Criteria andBaseAnalyseIdNotIn(List<String> values) {
            addCriterion("base_analyse_id not in", values, "baseAnalyseId");
            return (Criteria) this;
        }

        public Criteria andBaseAnalyseIdBetween(String value1, String value2) {
            addCriterion("base_analyse_id between", value1, value2, "baseAnalyseId");
            return (Criteria) this;
        }

        public Criteria andBaseAnalyseIdNotBetween(String value1, String value2) {
            addCriterion("base_analyse_id not between", value1, value2, "baseAnalyseId");
            return (Criteria) this;
        }

        public Criteria andSampleNumIsNull() {
            addCriterion("sample_num is null");
            return (Criteria) this;
        }

        public Criteria andSampleNumIsNotNull() {
            addCriterion("sample_num is not null");
            return (Criteria) this;
        }

        public Criteria andSampleNumEqualTo(Integer value) {
            addCriterion("sample_num =", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumNotEqualTo(Integer value) {
            addCriterion("sample_num <>", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumGreaterThan(Integer value) {
            addCriterion("sample_num >", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sample_num >=", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumLessThan(Integer value) {
            addCriterion("sample_num <", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumLessThanOrEqualTo(Integer value) {
            addCriterion("sample_num <=", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumIn(List<Integer> values) {
            addCriterion("sample_num in", values, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumNotIn(List<Integer> values) {
            addCriterion("sample_num not in", values, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumBetween(Integer value1, Integer value2) {
            addCriterion("sample_num between", value1, value2, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sample_num not between", value1, value2, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andAnalyseNumIsNull() {
            addCriterion("analyse_num is null");
            return (Criteria) this;
        }

        public Criteria andAnalyseNumIsNotNull() {
            addCriterion("analyse_num is not null");
            return (Criteria) this;
        }

        public Criteria andAnalyseNumEqualTo(Integer value) {
            addCriterion("analyse_num =", value, "analyseNum");
            return (Criteria) this;
        }

        public Criteria andAnalyseNumNotEqualTo(Integer value) {
            addCriterion("analyse_num <>", value, "analyseNum");
            return (Criteria) this;
        }

        public Criteria andAnalyseNumGreaterThan(Integer value) {
            addCriterion("analyse_num >", value, "analyseNum");
            return (Criteria) this;
        }

        public Criteria andAnalyseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("analyse_num >=", value, "analyseNum");
            return (Criteria) this;
        }

        public Criteria andAnalyseNumLessThan(Integer value) {
            addCriterion("analyse_num <", value, "analyseNum");
            return (Criteria) this;
        }

        public Criteria andAnalyseNumLessThanOrEqualTo(Integer value) {
            addCriterion("analyse_num <=", value, "analyseNum");
            return (Criteria) this;
        }

        public Criteria andAnalyseNumIn(List<Integer> values) {
            addCriterion("analyse_num in", values, "analyseNum");
            return (Criteria) this;
        }

        public Criteria andAnalyseNumNotIn(List<Integer> values) {
            addCriterion("analyse_num not in", values, "analyseNum");
            return (Criteria) this;
        }

        public Criteria andAnalyseNumBetween(Integer value1, Integer value2) {
            addCriterion("analyse_num between", value1, value2, "analyseNum");
            return (Criteria) this;
        }

        public Criteria andAnalyseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("analyse_num not between", value1, value2, "analyseNum");
            return (Criteria) this;
        }

        public Criteria andFeatureBelongIdIsNull() {
            addCriterion("feature_belong_id is null");
            return (Criteria) this;
        }

        public Criteria andFeatureBelongIdIsNotNull() {
            addCriterion("feature_belong_id is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureBelongIdEqualTo(String value) {
            addCriterion("feature_belong_id =", value, "featureBelongId");
            return (Criteria) this;
        }

        public Criteria andFeatureBelongIdNotEqualTo(String value) {
            addCriterion("feature_belong_id <>", value, "featureBelongId");
            return (Criteria) this;
        }

        public Criteria andFeatureBelongIdGreaterThan(String value) {
            addCriterion("feature_belong_id >", value, "featureBelongId");
            return (Criteria) this;
        }

        public Criteria andFeatureBelongIdGreaterThanOrEqualTo(String value) {
            addCriterion("feature_belong_id >=", value, "featureBelongId");
            return (Criteria) this;
        }

        public Criteria andFeatureBelongIdLessThan(String value) {
            addCriterion("feature_belong_id <", value, "featureBelongId");
            return (Criteria) this;
        }

        public Criteria andFeatureBelongIdLessThanOrEqualTo(String value) {
            addCriterion("feature_belong_id <=", value, "featureBelongId");
            return (Criteria) this;
        }

        public Criteria andFeatureBelongIdLike(String value) {
            addCriterion("feature_belong_id like", value, "featureBelongId");
            return (Criteria) this;
        }

        public Criteria andFeatureBelongIdNotLike(String value) {
            addCriterion("feature_belong_id not like", value, "featureBelongId");
            return (Criteria) this;
        }

        public Criteria andFeatureBelongIdIn(List<String> values) {
            addCriterion("feature_belong_id in", values, "featureBelongId");
            return (Criteria) this;
        }

        public Criteria andFeatureBelongIdNotIn(List<String> values) {
            addCriterion("feature_belong_id not in", values, "featureBelongId");
            return (Criteria) this;
        }

        public Criteria andFeatureBelongIdBetween(String value1, String value2) {
            addCriterion("feature_belong_id between", value1, value2, "featureBelongId");
            return (Criteria) this;
        }

        public Criteria andFeatureBelongIdNotBetween(String value1, String value2) {
            addCriterion("feature_belong_id not between", value1, value2, "featureBelongId");
            return (Criteria) this;
        }

        public Criteria andBeginOrderIdIsNull() {
            addCriterion("begin_order_id is null");
            return (Criteria) this;
        }

        public Criteria andBeginOrderIdIsNotNull() {
            addCriterion("begin_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andBeginOrderIdEqualTo(String value) {
            addCriterion("begin_order_id =", value, "beginOrderId");
            return (Criteria) this;
        }

        public Criteria andBeginOrderIdNotEqualTo(String value) {
            addCriterion("begin_order_id <>", value, "beginOrderId");
            return (Criteria) this;
        }

        public Criteria andBeginOrderIdGreaterThan(String value) {
            addCriterion("begin_order_id >", value, "beginOrderId");
            return (Criteria) this;
        }

        public Criteria andBeginOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("begin_order_id >=", value, "beginOrderId");
            return (Criteria) this;
        }

        public Criteria andBeginOrderIdLessThan(String value) {
            addCriterion("begin_order_id <", value, "beginOrderId");
            return (Criteria) this;
        }

        public Criteria andBeginOrderIdLessThanOrEqualTo(String value) {
            addCriterion("begin_order_id <=", value, "beginOrderId");
            return (Criteria) this;
        }

        public Criteria andBeginOrderIdLike(String value) {
            addCriterion("begin_order_id like", value, "beginOrderId");
            return (Criteria) this;
        }

        public Criteria andBeginOrderIdNotLike(String value) {
            addCriterion("begin_order_id not like", value, "beginOrderId");
            return (Criteria) this;
        }

        public Criteria andBeginOrderIdIn(List<String> values) {
            addCriterion("begin_order_id in", values, "beginOrderId");
            return (Criteria) this;
        }

        public Criteria andBeginOrderIdNotIn(List<String> values) {
            addCriterion("begin_order_id not in", values, "beginOrderId");
            return (Criteria) this;
        }

        public Criteria andBeginOrderIdBetween(String value1, String value2) {
            addCriterion("begin_order_id between", value1, value2, "beginOrderId");
            return (Criteria) this;
        }

        public Criteria andBeginOrderIdNotBetween(String value1, String value2) {
            addCriterion("begin_order_id not between", value1, value2, "beginOrderId");
            return (Criteria) this;
        }

        public Criteria andBeginTradeDateIsNull() {
            addCriterion("begin_trade_date is null");
            return (Criteria) this;
        }

        public Criteria andBeginTradeDateIsNotNull() {
            addCriterion("begin_trade_date is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTradeDateEqualTo(Date value) {
            addCriterionForJDBCDate("begin_trade_date =", value, "beginTradeDate");
            return (Criteria) this;
        }

        public Criteria andBeginTradeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("begin_trade_date <>", value, "beginTradeDate");
            return (Criteria) this;
        }

        public Criteria andBeginTradeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("begin_trade_date >", value, "beginTradeDate");
            return (Criteria) this;
        }

        public Criteria andBeginTradeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("begin_trade_date >=", value, "beginTradeDate");
            return (Criteria) this;
        }

        public Criteria andBeginTradeDateLessThan(Date value) {
            addCriterionForJDBCDate("begin_trade_date <", value, "beginTradeDate");
            return (Criteria) this;
        }

        public Criteria andBeginTradeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("begin_trade_date <=", value, "beginTradeDate");
            return (Criteria) this;
        }

        public Criteria andBeginTradeDateIn(List<Date> values) {
            addCriterionForJDBCDate("begin_trade_date in", values, "beginTradeDate");
            return (Criteria) this;
        }

        public Criteria andBeginTradeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("begin_trade_date not in", values, "beginTradeDate");
            return (Criteria) this;
        }

        public Criteria andBeginTradeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("begin_trade_date between", value1, value2, "beginTradeDate");
            return (Criteria) this;
        }

        public Criteria andBeginTradeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("begin_trade_date not between", value1, value2, "beginTradeDate");
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

        public Criteria andBottomPriceIsNull() {
            addCriterion("bottom_price is null");
            return (Criteria) this;
        }

        public Criteria andBottomPriceIsNotNull() {
            addCriterion("bottom_price is not null");
            return (Criteria) this;
        }

        public Criteria andBottomPriceEqualTo(BigDecimal value) {
            addCriterion("bottom_price =", value, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceNotEqualTo(BigDecimal value) {
            addCriterion("bottom_price <>", value, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceGreaterThan(BigDecimal value) {
            addCriterion("bottom_price >", value, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bottom_price >=", value, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceLessThan(BigDecimal value) {
            addCriterion("bottom_price <", value, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bottom_price <=", value, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceIn(List<BigDecimal> values) {
            addCriterion("bottom_price in", values, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceNotIn(List<BigDecimal> values) {
            addCriterion("bottom_price not in", values, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bottom_price between", value1, value2, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bottom_price not between", value1, value2, "bottomPrice");
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

        public Criteria andShakeRateIsNull() {
            addCriterion("shake_rate is null");
            return (Criteria) this;
        }

        public Criteria andShakeRateIsNotNull() {
            addCriterion("shake_rate is not null");
            return (Criteria) this;
        }

        public Criteria andShakeRateEqualTo(BigDecimal value) {
            addCriterion("shake_rate =", value, "shakeRate");
            return (Criteria) this;
        }

        public Criteria andShakeRateNotEqualTo(BigDecimal value) {
            addCriterion("shake_rate <>", value, "shakeRate");
            return (Criteria) this;
        }

        public Criteria andShakeRateGreaterThan(BigDecimal value) {
            addCriterion("shake_rate >", value, "shakeRate");
            return (Criteria) this;
        }

        public Criteria andShakeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shake_rate >=", value, "shakeRate");
            return (Criteria) this;
        }

        public Criteria andShakeRateLessThan(BigDecimal value) {
            addCriterion("shake_rate <", value, "shakeRate");
            return (Criteria) this;
        }

        public Criteria andShakeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shake_rate <=", value, "shakeRate");
            return (Criteria) this;
        }

        public Criteria andShakeRateIn(List<BigDecimal> values) {
            addCriterion("shake_rate in", values, "shakeRate");
            return (Criteria) this;
        }

        public Criteria andShakeRateNotIn(List<BigDecimal> values) {
            addCriterion("shake_rate not in", values, "shakeRate");
            return (Criteria) this;
        }

        public Criteria andShakeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shake_rate between", value1, value2, "shakeRate");
            return (Criteria) this;
        }

        public Criteria andShakeRateNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andTradeQuoteEqualTo(BigDecimal value) {
            addCriterion("trade_quote =", value, "tradeQuote");
            return (Criteria) this;
        }

        public Criteria andTradeQuoteNotEqualTo(BigDecimal value) {
            addCriterion("trade_quote <>", value, "tradeQuote");
            return (Criteria) this;
        }

        public Criteria andTradeQuoteGreaterThan(BigDecimal value) {
            addCriterion("trade_quote >", value, "tradeQuote");
            return (Criteria) this;
        }

        public Criteria andTradeQuoteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("trade_quote >=", value, "tradeQuote");
            return (Criteria) this;
        }

        public Criteria andTradeQuoteLessThan(BigDecimal value) {
            addCriterion("trade_quote <", value, "tradeQuote");
            return (Criteria) this;
        }

        public Criteria andTradeQuoteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("trade_quote <=", value, "tradeQuote");
            return (Criteria) this;
        }

        public Criteria andTradeQuoteIn(List<BigDecimal> values) {
            addCriterion("trade_quote in", values, "tradeQuote");
            return (Criteria) this;
        }

        public Criteria andTradeQuoteNotIn(List<BigDecimal> values) {
            addCriterion("trade_quote not in", values, "tradeQuote");
            return (Criteria) this;
        }

        public Criteria andTradeQuoteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trade_quote between", value1, value2, "tradeQuote");
            return (Criteria) this;
        }

        public Criteria andTradeQuoteNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andTradeAmountEqualTo(BigDecimal value) {
            addCriterion("trade_amount =", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotEqualTo(BigDecimal value) {
            addCriterion("trade_amount <>", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThan(BigDecimal value) {
            addCriterion("trade_amount >", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("trade_amount >=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThan(BigDecimal value) {
            addCriterion("trade_amount <", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("trade_amount <=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIn(List<BigDecimal> values) {
            addCriterion("trade_amount in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotIn(List<BigDecimal> values) {
            addCriterion("trade_amount not in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trade_amount between", value1, value2, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trade_amount not between", value1, value2, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andIsBrokenIsNull() {
            addCriterion("is_broken is null");
            return (Criteria) this;
        }

        public Criteria andIsBrokenIsNotNull() {
            addCriterion("is_broken is not null");
            return (Criteria) this;
        }

        public Criteria andIsBrokenEqualTo(Boolean value) {
            addCriterion("is_broken =", value, "isBroken");
            return (Criteria) this;
        }

        public Criteria andIsBrokenNotEqualTo(Boolean value) {
            addCriterion("is_broken <>", value, "isBroken");
            return (Criteria) this;
        }

        public Criteria andIsBrokenGreaterThan(Boolean value) {
            addCriterion("is_broken >", value, "isBroken");
            return (Criteria) this;
        }

        public Criteria andIsBrokenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_broken >=", value, "isBroken");
            return (Criteria) this;
        }

        public Criteria andIsBrokenLessThan(Boolean value) {
            addCriterion("is_broken <", value, "isBroken");
            return (Criteria) this;
        }

        public Criteria andIsBrokenLessThanOrEqualTo(Boolean value) {
            addCriterion("is_broken <=", value, "isBroken");
            return (Criteria) this;
        }

        public Criteria andIsBrokenIn(List<Boolean> values) {
            addCriterion("is_broken in", values, "isBroken");
            return (Criteria) this;
        }

        public Criteria andIsBrokenNotIn(List<Boolean> values) {
            addCriterion("is_broken not in", values, "isBroken");
            return (Criteria) this;
        }

        public Criteria andIsBrokenBetween(Boolean value1, Boolean value2) {
            addCriterion("is_broken between", value1, value2, "isBroken");
            return (Criteria) this;
        }

        public Criteria andIsBrokenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_broken not between", value1, value2, "isBroken");
            return (Criteria) this;
        }

        public Criteria andIsXdIsNull() {
            addCriterion("is_XD is null");
            return (Criteria) this;
        }

        public Criteria andIsXdIsNotNull() {
            addCriterion("is_XD is not null");
            return (Criteria) this;
        }

        public Criteria andIsXdEqualTo(Boolean value) {
            addCriterion("is_XD =", value, "isXd");
            return (Criteria) this;
        }

        public Criteria andIsXdNotEqualTo(Boolean value) {
            addCriterion("is_XD <>", value, "isXd");
            return (Criteria) this;
        }

        public Criteria andIsXdGreaterThan(Boolean value) {
            addCriterion("is_XD >", value, "isXd");
            return (Criteria) this;
        }

        public Criteria andIsXdGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_XD >=", value, "isXd");
            return (Criteria) this;
        }

        public Criteria andIsXdLessThan(Boolean value) {
            addCriterion("is_XD <", value, "isXd");
            return (Criteria) this;
        }

        public Criteria andIsXdLessThanOrEqualTo(Boolean value) {
            addCriterion("is_XD <=", value, "isXd");
            return (Criteria) this;
        }

        public Criteria andIsXdIn(List<Boolean> values) {
            addCriterion("is_XD in", values, "isXd");
            return (Criteria) this;
        }

        public Criteria andIsXdNotIn(List<Boolean> values) {
            addCriterion("is_XD not in", values, "isXd");
            return (Criteria) this;
        }

        public Criteria andIsXdBetween(Boolean value1, Boolean value2) {
            addCriterion("is_XD between", value1, value2, "isXd");
            return (Criteria) this;
        }

        public Criteria andIsXdNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_XD not between", value1, value2, "isXd");
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
    }
}
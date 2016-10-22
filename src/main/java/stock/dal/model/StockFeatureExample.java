package stock.dal.model;

import java.util.ArrayList;
import java.util.List;

public class StockFeatureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockFeatureExample() {
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

        public Criteria andBaseFeatureIdIsNull() {
            addCriterion("base_feature_id is null");
            return (Criteria) this;
        }

        public Criteria andBaseFeatureIdIsNotNull() {
            addCriterion("base_feature_id is not null");
            return (Criteria) this;
        }

        public Criteria andBaseFeatureIdEqualTo(String value) {
            addCriterion("base_feature_id =", value, "baseFeatureId");
            return (Criteria) this;
        }

        public Criteria andBaseFeatureIdNotEqualTo(String value) {
            addCriterion("base_feature_id <>", value, "baseFeatureId");
            return (Criteria) this;
        }

        public Criteria andBaseFeatureIdGreaterThan(String value) {
            addCriterion("base_feature_id >", value, "baseFeatureId");
            return (Criteria) this;
        }

        public Criteria andBaseFeatureIdGreaterThanOrEqualTo(String value) {
            addCriterion("base_feature_id >=", value, "baseFeatureId");
            return (Criteria) this;
        }

        public Criteria andBaseFeatureIdLessThan(String value) {
            addCriterion("base_feature_id <", value, "baseFeatureId");
            return (Criteria) this;
        }

        public Criteria andBaseFeatureIdLessThanOrEqualTo(String value) {
            addCriterion("base_feature_id <=", value, "baseFeatureId");
            return (Criteria) this;
        }

        public Criteria andBaseFeatureIdLike(String value) {
            addCriterion("base_feature_id like", value, "baseFeatureId");
            return (Criteria) this;
        }

        public Criteria andBaseFeatureIdNotLike(String value) {
            addCriterion("base_feature_id not like", value, "baseFeatureId");
            return (Criteria) this;
        }

        public Criteria andBaseFeatureIdIn(List<String> values) {
            addCriterion("base_feature_id in", values, "baseFeatureId");
            return (Criteria) this;
        }

        public Criteria andBaseFeatureIdNotIn(List<String> values) {
            addCriterion("base_feature_id not in", values, "baseFeatureId");
            return (Criteria) this;
        }

        public Criteria andBaseFeatureIdBetween(String value1, String value2) {
            addCriterion("base_feature_id between", value1, value2, "baseFeatureId");
            return (Criteria) this;
        }

        public Criteria andBaseFeatureIdNotBetween(String value1, String value2) {
            addCriterion("base_feature_id not between", value1, value2, "baseFeatureId");
            return (Criteria) this;
        }

        public Criteria andNewRuleIdIsNull() {
            addCriterion("new_rule_id is null");
            return (Criteria) this;
        }

        public Criteria andNewRuleIdIsNotNull() {
            addCriterion("new_rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewRuleIdEqualTo(String value) {
            addCriterion("new_rule_id =", value, "newRuleId");
            return (Criteria) this;
        }

        public Criteria andNewRuleIdNotEqualTo(String value) {
            addCriterion("new_rule_id <>", value, "newRuleId");
            return (Criteria) this;
        }

        public Criteria andNewRuleIdGreaterThan(String value) {
            addCriterion("new_rule_id >", value, "newRuleId");
            return (Criteria) this;
        }

        public Criteria andNewRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("new_rule_id >=", value, "newRuleId");
            return (Criteria) this;
        }

        public Criteria andNewRuleIdLessThan(String value) {
            addCriterion("new_rule_id <", value, "newRuleId");
            return (Criteria) this;
        }

        public Criteria andNewRuleIdLessThanOrEqualTo(String value) {
            addCriterion("new_rule_id <=", value, "newRuleId");
            return (Criteria) this;
        }

        public Criteria andNewRuleIdLike(String value) {
            addCriterion("new_rule_id like", value, "newRuleId");
            return (Criteria) this;
        }

        public Criteria andNewRuleIdNotLike(String value) {
            addCriterion("new_rule_id not like", value, "newRuleId");
            return (Criteria) this;
        }

        public Criteria andNewRuleIdIn(List<String> values) {
            addCriterion("new_rule_id in", values, "newRuleId");
            return (Criteria) this;
        }

        public Criteria andNewRuleIdNotIn(List<String> values) {
            addCriterion("new_rule_id not in", values, "newRuleId");
            return (Criteria) this;
        }

        public Criteria andNewRuleIdBetween(String value1, String value2) {
            addCriterion("new_rule_id between", value1, value2, "newRuleId");
            return (Criteria) this;
        }

        public Criteria andNewRuleIdNotBetween(String value1, String value2) {
            addCriterion("new_rule_id not between", value1, value2, "newRuleId");
            return (Criteria) this;
        }

        public Criteria andDescIsNull() {
            addCriterion("desc is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion("desc is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion("desc =", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion("desc <>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion("desc >", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("desc >=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion("desc <", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("desc <=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLike(String value) {
            addCriterion("desc like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String value) {
            addCriterion("desc not like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(List<String> values) {
            addCriterion("desc in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(List<String> values) {
            addCriterion("desc not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("desc between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("desc not between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andIsOriginIsNull() {
            addCriterion("is_origin is null");
            return (Criteria) this;
        }

        public Criteria andIsOriginIsNotNull() {
            addCriterion("is_origin is not null");
            return (Criteria) this;
        }

        public Criteria andIsOriginEqualTo(Boolean value) {
            addCriterion("is_origin =", value, "isOrigin");
            return (Criteria) this;
        }

        public Criteria andIsOriginNotEqualTo(Boolean value) {
            addCriterion("is_origin <>", value, "isOrigin");
            return (Criteria) this;
        }

        public Criteria andIsOriginGreaterThan(Boolean value) {
            addCriterion("is_origin >", value, "isOrigin");
            return (Criteria) this;
        }

        public Criteria andIsOriginGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_origin >=", value, "isOrigin");
            return (Criteria) this;
        }

        public Criteria andIsOriginLessThan(Boolean value) {
            addCriterion("is_origin <", value, "isOrigin");
            return (Criteria) this;
        }

        public Criteria andIsOriginLessThanOrEqualTo(Boolean value) {
            addCriterion("is_origin <=", value, "isOrigin");
            return (Criteria) this;
        }

        public Criteria andIsOriginIn(List<Boolean> values) {
            addCriterion("is_origin in", values, "isOrigin");
            return (Criteria) this;
        }

        public Criteria andIsOriginNotIn(List<Boolean> values) {
            addCriterion("is_origin not in", values, "isOrigin");
            return (Criteria) this;
        }

        public Criteria andIsOriginBetween(Boolean value1, Boolean value2) {
            addCriterion("is_origin between", value1, value2, "isOrigin");
            return (Criteria) this;
        }

        public Criteria andIsOriginNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_origin not between", value1, value2, "isOrigin");
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
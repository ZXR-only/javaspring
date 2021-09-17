package com.zxr.model;

import java.util.ArrayList;
import java.util.List;

public class KkeysExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KkeysExample() {
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

        public Criteria and型号IsNull() {
            addCriterion("型号 is null");
            return (Criteria) this;
        }

        public Criteria and型号IsNotNull() {
            addCriterion("型号 is not null");
            return (Criteria) this;
        }

        public Criteria and型号EqualTo(String value) {
            addCriterion("型号 =", value, "型号");
            return (Criteria) this;
        }

        public Criteria and型号NotEqualTo(String value) {
            addCriterion("型号 <>", value, "型号");
            return (Criteria) this;
        }

        public Criteria and型号GreaterThan(String value) {
            addCriterion("型号 >", value, "型号");
            return (Criteria) this;
        }

        public Criteria and型号GreaterThanOrEqualTo(String value) {
            addCriterion("型号 >=", value, "型号");
            return (Criteria) this;
        }

        public Criteria and型号LessThan(String value) {
            addCriterion("型号 <", value, "型号");
            return (Criteria) this;
        }

        public Criteria and型号LessThanOrEqualTo(String value) {
            addCriterion("型号 <=", value, "型号");
            return (Criteria) this;
        }

        public Criteria and型号Like(String value) {
            addCriterion("型号 like", value, "型号");
            return (Criteria) this;
        }

        public Criteria and型号NotLike(String value) {
            addCriterion("型号 not like", value, "型号");
            return (Criteria) this;
        }

        public Criteria and型号In(List<String> values) {
            addCriterion("型号 in", values, "型号");
            return (Criteria) this;
        }

        public Criteria and型号NotIn(List<String> values) {
            addCriterion("型号 not in", values, "型号");
            return (Criteria) this;
        }

        public Criteria and型号Between(String value1, String value2) {
            addCriterion("型号 between", value1, value2, "型号");
            return (Criteria) this;
        }

        public Criteria and型号NotBetween(String value1, String value2) {
            addCriterion("型号 not between", value1, value2, "型号");
            return (Criteria) this;
        }

        public Criteria and厂商IsNull() {
            addCriterion("厂商 is null");
            return (Criteria) this;
        }

        public Criteria and厂商IsNotNull() {
            addCriterion("厂商 is not null");
            return (Criteria) this;
        }

        public Criteria and厂商EqualTo(String value) {
            addCriterion("厂商 =", value, "厂商");
            return (Criteria) this;
        }

        public Criteria and厂商NotEqualTo(String value) {
            addCriterion("厂商 <>", value, "厂商");
            return (Criteria) this;
        }

        public Criteria and厂商GreaterThan(String value) {
            addCriterion("厂商 >", value, "厂商");
            return (Criteria) this;
        }

        public Criteria and厂商GreaterThanOrEqualTo(String value) {
            addCriterion("厂商 >=", value, "厂商");
            return (Criteria) this;
        }

        public Criteria and厂商LessThan(String value) {
            addCriterion("厂商 <", value, "厂商");
            return (Criteria) this;
        }

        public Criteria and厂商LessThanOrEqualTo(String value) {
            addCriterion("厂商 <=", value, "厂商");
            return (Criteria) this;
        }

        public Criteria and厂商Like(String value) {
            addCriterion("厂商 like", value, "厂商");
            return (Criteria) this;
        }

        public Criteria and厂商NotLike(String value) {
            addCriterion("厂商 not like", value, "厂商");
            return (Criteria) this;
        }

        public Criteria and厂商In(List<String> values) {
            addCriterion("厂商 in", values, "厂商");
            return (Criteria) this;
        }

        public Criteria and厂商NotIn(List<String> values) {
            addCriterion("厂商 not in", values, "厂商");
            return (Criteria) this;
        }

        public Criteria and厂商Between(String value1, String value2) {
            addCriterion("厂商 between", value1, value2, "厂商");
            return (Criteria) this;
        }

        public Criteria and厂商NotBetween(String value1, String value2) {
            addCriterion("厂商 not between", value1, value2, "厂商");
            return (Criteria) this;
        }

        public Criteria and编号IsNull() {
            addCriterion("编号 is null");
            return (Criteria) this;
        }

        public Criteria and编号IsNotNull() {
            addCriterion("编号 is not null");
            return (Criteria) this;
        }

        public Criteria and编号EqualTo(Integer value) {
            addCriterion("编号 =", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号NotEqualTo(Integer value) {
            addCriterion("编号 <>", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号GreaterThan(Integer value) {
            addCriterion("编号 >", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号GreaterThanOrEqualTo(Integer value) {
            addCriterion("编号 >=", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号LessThan(Integer value) {
            addCriterion("编号 <", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号LessThanOrEqualTo(Integer value) {
            addCriterion("编号 <=", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号In(List<Integer> values) {
            addCriterion("编号 in", values, "编号");
            return (Criteria) this;
        }

        public Criteria and编号NotIn(List<Integer> values) {
            addCriterion("编号 not in", values, "编号");
            return (Criteria) this;
        }

        public Criteria and编号Between(Integer value1, Integer value2) {
            addCriterion("编号 between", value1, value2, "编号");
            return (Criteria) this;
        }

        public Criteria and编号NotBetween(Integer value1, Integer value2) {
            addCriterion("编号 not between", value1, value2, "编号");
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
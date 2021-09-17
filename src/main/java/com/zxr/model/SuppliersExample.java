package com.zxr.model;

import java.util.ArrayList;
import java.util.List;

public class SuppliersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SuppliersExample() {
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

        public Criteria and供应商名字IsNull() {
            addCriterion("供应商名字 is null");
            return (Criteria) this;
        }

        public Criteria and供应商名字IsNotNull() {
            addCriterion("供应商名字 is not null");
            return (Criteria) this;
        }

        public Criteria and供应商名字EqualTo(String value) {
            addCriterion("供应商名字 =", value, "供应商名字");
            return (Criteria) this;
        }

        public Criteria and供应商名字NotEqualTo(String value) {
            addCriterion("供应商名字 <>", value, "供应商名字");
            return (Criteria) this;
        }

        public Criteria and供应商名字GreaterThan(String value) {
            addCriterion("供应商名字 >", value, "供应商名字");
            return (Criteria) this;
        }

        public Criteria and供应商名字GreaterThanOrEqualTo(String value) {
            addCriterion("供应商名字 >=", value, "供应商名字");
            return (Criteria) this;
        }

        public Criteria and供应商名字LessThan(String value) {
            addCriterion("供应商名字 <", value, "供应商名字");
            return (Criteria) this;
        }

        public Criteria and供应商名字LessThanOrEqualTo(String value) {
            addCriterion("供应商名字 <=", value, "供应商名字");
            return (Criteria) this;
        }

        public Criteria and供应商名字Like(String value) {
            addCriterion("供应商名字 like", value, "供应商名字");
            return (Criteria) this;
        }

        public Criteria and供应商名字NotLike(String value) {
            addCriterion("供应商名字 not like", value, "供应商名字");
            return (Criteria) this;
        }

        public Criteria and供应商名字In(List<String> values) {
            addCriterion("供应商名字 in", values, "供应商名字");
            return (Criteria) this;
        }

        public Criteria and供应商名字NotIn(List<String> values) {
            addCriterion("供应商名字 not in", values, "供应商名字");
            return (Criteria) this;
        }

        public Criteria and供应商名字Between(String value1, String value2) {
            addCriterion("供应商名字 between", value1, value2, "供应商名字");
            return (Criteria) this;
        }

        public Criteria and供应商名字NotBetween(String value1, String value2) {
            addCriterion("供应商名字 not between", value1, value2, "供应商名字");
            return (Criteria) this;
        }

        public Criteria and生产货品IsNull() {
            addCriterion("生产货品 is null");
            return (Criteria) this;
        }

        public Criteria and生产货品IsNotNull() {
            addCriterion("生产货品 is not null");
            return (Criteria) this;
        }

        public Criteria and生产货品EqualTo(String value) {
            addCriterion("生产货品 =", value, "生产货品");
            return (Criteria) this;
        }

        public Criteria and生产货品NotEqualTo(String value) {
            addCriterion("生产货品 <>", value, "生产货品");
            return (Criteria) this;
        }

        public Criteria and生产货品GreaterThan(String value) {
            addCriterion("生产货品 >", value, "生产货品");
            return (Criteria) this;
        }

        public Criteria and生产货品GreaterThanOrEqualTo(String value) {
            addCriterion("生产货品 >=", value, "生产货品");
            return (Criteria) this;
        }

        public Criteria and生产货品LessThan(String value) {
            addCriterion("生产货品 <", value, "生产货品");
            return (Criteria) this;
        }

        public Criteria and生产货品LessThanOrEqualTo(String value) {
            addCriterion("生产货品 <=", value, "生产货品");
            return (Criteria) this;
        }

        public Criteria and生产货品Like(String value) {
            addCriterion("生产货品 like", value, "生产货品");
            return (Criteria) this;
        }

        public Criteria and生产货品NotLike(String value) {
            addCriterion("生产货品 not like", value, "生产货品");
            return (Criteria) this;
        }

        public Criteria and生产货品In(List<String> values) {
            addCriterion("生产货品 in", values, "生产货品");
            return (Criteria) this;
        }

        public Criteria and生产货品NotIn(List<String> values) {
            addCriterion("生产货品 not in", values, "生产货品");
            return (Criteria) this;
        }

        public Criteria and生产货品Between(String value1, String value2) {
            addCriterion("生产货品 between", value1, value2, "生产货品");
            return (Criteria) this;
        }

        public Criteria and生产货品NotBetween(String value1, String value2) {
            addCriterion("生产货品 not between", value1, value2, "生产货品");
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
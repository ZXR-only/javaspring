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

        public Criteria and��Ӧ������IsNull() {
            addCriterion("��Ӧ������ is null");
            return (Criteria) this;
        }

        public Criteria and��Ӧ������IsNotNull() {
            addCriterion("��Ӧ������ is not null");
            return (Criteria) this;
        }

        public Criteria and��Ӧ������EqualTo(String value) {
            addCriterion("��Ӧ������ =", value, "��Ӧ������");
            return (Criteria) this;
        }

        public Criteria and��Ӧ������NotEqualTo(String value) {
            addCriterion("��Ӧ������ <>", value, "��Ӧ������");
            return (Criteria) this;
        }

        public Criteria and��Ӧ������GreaterThan(String value) {
            addCriterion("��Ӧ������ >", value, "��Ӧ������");
            return (Criteria) this;
        }

        public Criteria and��Ӧ������GreaterThanOrEqualTo(String value) {
            addCriterion("��Ӧ������ >=", value, "��Ӧ������");
            return (Criteria) this;
        }

        public Criteria and��Ӧ������LessThan(String value) {
            addCriterion("��Ӧ������ <", value, "��Ӧ������");
            return (Criteria) this;
        }

        public Criteria and��Ӧ������LessThanOrEqualTo(String value) {
            addCriterion("��Ӧ������ <=", value, "��Ӧ������");
            return (Criteria) this;
        }

        public Criteria and��Ӧ������Like(String value) {
            addCriterion("��Ӧ������ like", value, "��Ӧ������");
            return (Criteria) this;
        }

        public Criteria and��Ӧ������NotLike(String value) {
            addCriterion("��Ӧ������ not like", value, "��Ӧ������");
            return (Criteria) this;
        }

        public Criteria and��Ӧ������In(List<String> values) {
            addCriterion("��Ӧ������ in", values, "��Ӧ������");
            return (Criteria) this;
        }

        public Criteria and��Ӧ������NotIn(List<String> values) {
            addCriterion("��Ӧ������ not in", values, "��Ӧ������");
            return (Criteria) this;
        }

        public Criteria and��Ӧ������Between(String value1, String value2) {
            addCriterion("��Ӧ������ between", value1, value2, "��Ӧ������");
            return (Criteria) this;
        }

        public Criteria and��Ӧ������NotBetween(String value1, String value2) {
            addCriterion("��Ӧ������ not between", value1, value2, "��Ӧ������");
            return (Criteria) this;
        }

        public Criteria and������ƷIsNull() {
            addCriterion("������Ʒ is null");
            return (Criteria) this;
        }

        public Criteria and������ƷIsNotNull() {
            addCriterion("������Ʒ is not null");
            return (Criteria) this;
        }

        public Criteria and������ƷEqualTo(String value) {
            addCriterion("������Ʒ =", value, "������Ʒ");
            return (Criteria) this;
        }

        public Criteria and������ƷNotEqualTo(String value) {
            addCriterion("������Ʒ <>", value, "������Ʒ");
            return (Criteria) this;
        }

        public Criteria and������ƷGreaterThan(String value) {
            addCriterion("������Ʒ >", value, "������Ʒ");
            return (Criteria) this;
        }

        public Criteria and������ƷGreaterThanOrEqualTo(String value) {
            addCriterion("������Ʒ >=", value, "������Ʒ");
            return (Criteria) this;
        }

        public Criteria and������ƷLessThan(String value) {
            addCriterion("������Ʒ <", value, "������Ʒ");
            return (Criteria) this;
        }

        public Criteria and������ƷLessThanOrEqualTo(String value) {
            addCriterion("������Ʒ <=", value, "������Ʒ");
            return (Criteria) this;
        }

        public Criteria and������ƷLike(String value) {
            addCriterion("������Ʒ like", value, "������Ʒ");
            return (Criteria) this;
        }

        public Criteria and������ƷNotLike(String value) {
            addCriterion("������Ʒ not like", value, "������Ʒ");
            return (Criteria) this;
        }

        public Criteria and������ƷIn(List<String> values) {
            addCriterion("������Ʒ in", values, "������Ʒ");
            return (Criteria) this;
        }

        public Criteria and������ƷNotIn(List<String> values) {
            addCriterion("������Ʒ not in", values, "������Ʒ");
            return (Criteria) this;
        }

        public Criteria and������ƷBetween(String value1, String value2) {
            addCriterion("������Ʒ between", value1, value2, "������Ʒ");
            return (Criteria) this;
        }

        public Criteria and������ƷNotBetween(String value1, String value2) {
            addCriterion("������Ʒ not between", value1, value2, "������Ʒ");
            return (Criteria) this;
        }

        public Criteria and���IsNull() {
            addCriterion("��� is null");
            return (Criteria) this;
        }

        public Criteria and���IsNotNull() {
            addCriterion("��� is not null");
            return (Criteria) this;
        }

        public Criteria and���EqualTo(Integer value) {
            addCriterion("��� =", value, "���");
            return (Criteria) this;
        }

        public Criteria and���NotEqualTo(Integer value) {
            addCriterion("��� <>", value, "���");
            return (Criteria) this;
        }

        public Criteria and���GreaterThan(Integer value) {
            addCriterion("��� >", value, "���");
            return (Criteria) this;
        }

        public Criteria and���GreaterThanOrEqualTo(Integer value) {
            addCriterion("��� >=", value, "���");
            return (Criteria) this;
        }

        public Criteria and���LessThan(Integer value) {
            addCriterion("��� <", value, "���");
            return (Criteria) this;
        }

        public Criteria and���LessThanOrEqualTo(Integer value) {
            addCriterion("��� <=", value, "���");
            return (Criteria) this;
        }

        public Criteria and���In(List<Integer> values) {
            addCriterion("��� in", values, "���");
            return (Criteria) this;
        }

        public Criteria and���NotIn(List<Integer> values) {
            addCriterion("��� not in", values, "���");
            return (Criteria) this;
        }

        public Criteria and���Between(Integer value1, Integer value2) {
            addCriterion("��� between", value1, value2, "���");
            return (Criteria) this;
        }

        public Criteria and���NotBetween(Integer value1, Integer value2) {
            addCriterion("��� not between", value1, value2, "���");
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
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

        public Criteria and�ͺ�IsNull() {
            addCriterion("�ͺ� is null");
            return (Criteria) this;
        }

        public Criteria and�ͺ�IsNotNull() {
            addCriterion("�ͺ� is not null");
            return (Criteria) this;
        }

        public Criteria and�ͺ�EqualTo(String value) {
            addCriterion("�ͺ� =", value, "�ͺ�");
            return (Criteria) this;
        }

        public Criteria and�ͺ�NotEqualTo(String value) {
            addCriterion("�ͺ� <>", value, "�ͺ�");
            return (Criteria) this;
        }

        public Criteria and�ͺ�GreaterThan(String value) {
            addCriterion("�ͺ� >", value, "�ͺ�");
            return (Criteria) this;
        }

        public Criteria and�ͺ�GreaterThanOrEqualTo(String value) {
            addCriterion("�ͺ� >=", value, "�ͺ�");
            return (Criteria) this;
        }

        public Criteria and�ͺ�LessThan(String value) {
            addCriterion("�ͺ� <", value, "�ͺ�");
            return (Criteria) this;
        }

        public Criteria and�ͺ�LessThanOrEqualTo(String value) {
            addCriterion("�ͺ� <=", value, "�ͺ�");
            return (Criteria) this;
        }

        public Criteria and�ͺ�Like(String value) {
            addCriterion("�ͺ� like", value, "�ͺ�");
            return (Criteria) this;
        }

        public Criteria and�ͺ�NotLike(String value) {
            addCriterion("�ͺ� not like", value, "�ͺ�");
            return (Criteria) this;
        }

        public Criteria and�ͺ�In(List<String> values) {
            addCriterion("�ͺ� in", values, "�ͺ�");
            return (Criteria) this;
        }

        public Criteria and�ͺ�NotIn(List<String> values) {
            addCriterion("�ͺ� not in", values, "�ͺ�");
            return (Criteria) this;
        }

        public Criteria and�ͺ�Between(String value1, String value2) {
            addCriterion("�ͺ� between", value1, value2, "�ͺ�");
            return (Criteria) this;
        }

        public Criteria and�ͺ�NotBetween(String value1, String value2) {
            addCriterion("�ͺ� not between", value1, value2, "�ͺ�");
            return (Criteria) this;
        }

        public Criteria and����IsNull() {
            addCriterion("���� is null");
            return (Criteria) this;
        }

        public Criteria and����IsNotNull() {
            addCriterion("���� is not null");
            return (Criteria) this;
        }

        public Criteria and����EqualTo(String value) {
            addCriterion("���� =", value, "����");
            return (Criteria) this;
        }

        public Criteria and����NotEqualTo(String value) {
            addCriterion("���� <>", value, "����");
            return (Criteria) this;
        }

        public Criteria and����GreaterThan(String value) {
            addCriterion("���� >", value, "����");
            return (Criteria) this;
        }

        public Criteria and����GreaterThanOrEqualTo(String value) {
            addCriterion("���� >=", value, "����");
            return (Criteria) this;
        }

        public Criteria and����LessThan(String value) {
            addCriterion("���� <", value, "����");
            return (Criteria) this;
        }

        public Criteria and����LessThanOrEqualTo(String value) {
            addCriterion("���� <=", value, "����");
            return (Criteria) this;
        }

        public Criteria and����Like(String value) {
            addCriterion("���� like", value, "����");
            return (Criteria) this;
        }

        public Criteria and����NotLike(String value) {
            addCriterion("���� not like", value, "����");
            return (Criteria) this;
        }

        public Criteria and����In(List<String> values) {
            addCriterion("���� in", values, "����");
            return (Criteria) this;
        }

        public Criteria and����NotIn(List<String> values) {
            addCriterion("���� not in", values, "����");
            return (Criteria) this;
        }

        public Criteria and����Between(String value1, String value2) {
            addCriterion("���� between", value1, value2, "����");
            return (Criteria) this;
        }

        public Criteria and����NotBetween(String value1, String value2) {
            addCriterion("���� not between", value1, value2, "����");
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
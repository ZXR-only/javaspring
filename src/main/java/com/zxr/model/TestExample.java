package com.zxr.model;

import java.util.ArrayList;
import java.util.List;

public class TestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestExample() {
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

        public Criteria andUseidIsNull() {
            addCriterion("useid is null");
            return (Criteria) this;
        }

        public Criteria andUseidIsNotNull() {
            addCriterion("useid is not null");
            return (Criteria) this;
        }

        public Criteria andUseidEqualTo(Integer value) {
            addCriterion("useid =", value, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidNotEqualTo(Integer value) {
            addCriterion("useid <>", value, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidGreaterThan(Integer value) {
            addCriterion("useid >", value, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("useid >=", value, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidLessThan(Integer value) {
            addCriterion("useid <", value, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidLessThanOrEqualTo(Integer value) {
            addCriterion("useid <=", value, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidIn(List<Integer> values) {
            addCriterion("useid in", values, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidNotIn(List<Integer> values) {
            addCriterion("useid not in", values, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidBetween(Integer value1, Integer value2) {
            addCriterion("useid between", value1, value2, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidNotBetween(Integer value1, Integer value2) {
            addCriterion("useid not between", value1, value2, "useid");
            return (Criteria) this;
        }

        public Criteria andUsenameIsNull() {
            addCriterion("usename is null");
            return (Criteria) this;
        }

        public Criteria andUsenameIsNotNull() {
            addCriterion("usename is not null");
            return (Criteria) this;
        }

        public Criteria andUsenameEqualTo(String value) {
            addCriterion("usename =", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameNotEqualTo(String value) {
            addCriterion("usename <>", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameGreaterThan(String value) {
            addCriterion("usename >", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameGreaterThanOrEqualTo(String value) {
            addCriterion("usename >=", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameLessThan(String value) {
            addCriterion("usename <", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameLessThanOrEqualTo(String value) {
            addCriterion("usename <=", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameLike(String value) {
            addCriterion("usename like", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameNotLike(String value) {
            addCriterion("usename not like", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameIn(List<String> values) {
            addCriterion("usename in", values, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameNotIn(List<String> values) {
            addCriterion("usename not in", values, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameBetween(String value1, String value2) {
            addCriterion("usename between", value1, value2, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameNotBetween(String value1, String value2) {
            addCriterion("usename not between", value1, value2, "usename");
            return (Criteria) this;
        }

        public Criteria andUseageIsNull() {
            addCriterion("useage is null");
            return (Criteria) this;
        }

        public Criteria andUseageIsNotNull() {
            addCriterion("useage is not null");
            return (Criteria) this;
        }

        public Criteria andUseageEqualTo(Integer value) {
            addCriterion("useage =", value, "useage");
            return (Criteria) this;
        }

        public Criteria andUseageNotEqualTo(Integer value) {
            addCriterion("useage <>", value, "useage");
            return (Criteria) this;
        }

        public Criteria andUseageGreaterThan(Integer value) {
            addCriterion("useage >", value, "useage");
            return (Criteria) this;
        }

        public Criteria andUseageGreaterThanOrEqualTo(Integer value) {
            addCriterion("useage >=", value, "useage");
            return (Criteria) this;
        }

        public Criteria andUseageLessThan(Integer value) {
            addCriterion("useage <", value, "useage");
            return (Criteria) this;
        }

        public Criteria andUseageLessThanOrEqualTo(Integer value) {
            addCriterion("useage <=", value, "useage");
            return (Criteria) this;
        }

        public Criteria andUseageIn(List<Integer> values) {
            addCriterion("useage in", values, "useage");
            return (Criteria) this;
        }

        public Criteria andUseageNotIn(List<Integer> values) {
            addCriterion("useage not in", values, "useage");
            return (Criteria) this;
        }

        public Criteria andUseageBetween(Integer value1, Integer value2) {
            addCriterion("useage between", value1, value2, "useage");
            return (Criteria) this;
        }

        public Criteria andUseageNotBetween(Integer value1, Integer value2) {
            addCriterion("useage not between", value1, value2, "useage");
            return (Criteria) this;
        }

        public Criteria andUsesalaryIsNull() {
            addCriterion("usesalary is null");
            return (Criteria) this;
        }

        public Criteria andUsesalaryIsNotNull() {
            addCriterion("usesalary is not null");
            return (Criteria) this;
        }

        public Criteria andUsesalaryEqualTo(Integer value) {
            addCriterion("usesalary =", value, "usesalary");
            return (Criteria) this;
        }

        public Criteria andUsesalaryNotEqualTo(Integer value) {
            addCriterion("usesalary <>", value, "usesalary");
            return (Criteria) this;
        }

        public Criteria andUsesalaryGreaterThan(Integer value) {
            addCriterion("usesalary >", value, "usesalary");
            return (Criteria) this;
        }

        public Criteria andUsesalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("usesalary >=", value, "usesalary");
            return (Criteria) this;
        }

        public Criteria andUsesalaryLessThan(Integer value) {
            addCriterion("usesalary <", value, "usesalary");
            return (Criteria) this;
        }

        public Criteria andUsesalaryLessThanOrEqualTo(Integer value) {
            addCriterion("usesalary <=", value, "usesalary");
            return (Criteria) this;
        }

        public Criteria andUsesalaryIn(List<Integer> values) {
            addCriterion("usesalary in", values, "usesalary");
            return (Criteria) this;
        }

        public Criteria andUsesalaryNotIn(List<Integer> values) {
            addCriterion("usesalary not in", values, "usesalary");
            return (Criteria) this;
        }

        public Criteria andUsesalaryBetween(Integer value1, Integer value2) {
            addCriterion("usesalary between", value1, value2, "usesalary");
            return (Criteria) this;
        }

        public Criteria andUsesalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("usesalary not between", value1, value2, "usesalary");
            return (Criteria) this;
        }

        public Criteria andUselevelIsNull() {
            addCriterion("uselevel is null");
            return (Criteria) this;
        }

        public Criteria andUselevelIsNotNull() {
            addCriterion("uselevel is not null");
            return (Criteria) this;
        }

        public Criteria andUselevelEqualTo(String value) {
            addCriterion("uselevel =", value, "uselevel");
            return (Criteria) this;
        }

        public Criteria andUselevelNotEqualTo(String value) {
            addCriterion("uselevel <>", value, "uselevel");
            return (Criteria) this;
        }

        public Criteria andUselevelGreaterThan(String value) {
            addCriterion("uselevel >", value, "uselevel");
            return (Criteria) this;
        }

        public Criteria andUselevelGreaterThanOrEqualTo(String value) {
            addCriterion("uselevel >=", value, "uselevel");
            return (Criteria) this;
        }

        public Criteria andUselevelLessThan(String value) {
            addCriterion("uselevel <", value, "uselevel");
            return (Criteria) this;
        }

        public Criteria andUselevelLessThanOrEqualTo(String value) {
            addCriterion("uselevel <=", value, "uselevel");
            return (Criteria) this;
        }

        public Criteria andUselevelLike(String value) {
            addCriterion("uselevel like", value, "uselevel");
            return (Criteria) this;
        }

        public Criteria andUselevelNotLike(String value) {
            addCriterion("uselevel not like", value, "uselevel");
            return (Criteria) this;
        }

        public Criteria andUselevelIn(List<String> values) {
            addCriterion("uselevel in", values, "uselevel");
            return (Criteria) this;
        }

        public Criteria andUselevelNotIn(List<String> values) {
            addCriterion("uselevel not in", values, "uselevel");
            return (Criteria) this;
        }

        public Criteria andUselevelBetween(String value1, String value2) {
            addCriterion("uselevel between", value1, value2, "uselevel");
            return (Criteria) this;
        }

        public Criteria andUselevelNotBetween(String value1, String value2) {
            addCriterion("uselevel not between", value1, value2, "uselevel");
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
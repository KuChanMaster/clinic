package com.swjd.pojo;

import java.util.ArrayList;
import java.util.List;

public class AllergyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AllergyExample() {
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

        public Criteria andMnoIsNull() {
            addCriterion("mno is null");
            return (Criteria) this;
        }

        public Criteria andMnoIsNotNull() {
            addCriterion("mno is not null");
            return (Criteria) this;
        }

        public Criteria andMnoEqualTo(Integer value) {
            addCriterion("mno =", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoNotEqualTo(Integer value) {
            addCriterion("mno <>", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoGreaterThan(Integer value) {
            addCriterion("mno >", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("mno >=", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoLessThan(Integer value) {
            addCriterion("mno <", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoLessThanOrEqualTo(Integer value) {
            addCriterion("mno <=", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoIn(List<Integer> values) {
            addCriterion("mno in", values, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoNotIn(List<Integer> values) {
            addCriterion("mno not in", values, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoBetween(Integer value1, Integer value2) {
            addCriterion("mno between", value1, value2, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoNotBetween(Integer value1, Integer value2) {
            addCriterion("mno not between", value1, value2, "mno");
            return (Criteria) this;
        }

        public Criteria andSnoIsNull() {
            addCriterion("sno is null");
            return (Criteria) this;
        }

        public Criteria andSnoIsNotNull() {
            addCriterion("sno is not null");
            return (Criteria) this;
        }

        public Criteria andSnoEqualTo(Integer value) {
            addCriterion("sno =", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotEqualTo(Integer value) {
            addCriterion("sno <>", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThan(Integer value) {
            addCriterion("sno >", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sno >=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThan(Integer value) {
            addCriterion("sno <", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThanOrEqualTo(Integer value) {
            addCriterion("sno <=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoIn(List<Integer> values) {
            addCriterion("sno in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotIn(List<Integer> values) {
            addCriterion("sno not in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoBetween(Integer value1, Integer value2) {
            addCriterion("sno between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotBetween(Integer value1, Integer value2) {
            addCriterion("sno not between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andPnoIsNull() {
            addCriterion("pno is null");
            return (Criteria) this;
        }

        public Criteria andPnoIsNotNull() {
            addCriterion("pno is not null");
            return (Criteria) this;
        }

        public Criteria andPnoEqualTo(Integer value) {
            addCriterion("pno =", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoNotEqualTo(Integer value) {
            addCriterion("pno <>", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoGreaterThan(Integer value) {
            addCriterion("pno >", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("pno >=", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoLessThan(Integer value) {
            addCriterion("pno <", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoLessThanOrEqualTo(Integer value) {
            addCriterion("pno <=", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoIn(List<Integer> values) {
            addCriterion("pno in", values, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoNotIn(List<Integer> values) {
            addCriterion("pno not in", values, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoBetween(Integer value1, Integer value2) {
            addCriterion("pno between", value1, value2, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoNotBetween(Integer value1, Integer value2) {
            addCriterion("pno not between", value1, value2, "pno");
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
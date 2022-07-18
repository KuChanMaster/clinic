package com.swjd.pojo;

import java.util.ArrayList;
import java.util.List;

public class DoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorExample() {
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

        public Criteria andDnoIsNull() {
            addCriterion("DNo is null");
            return (Criteria) this;
        }

        public Criteria andDnoIsNotNull() {
            addCriterion("DNo is not null");
            return (Criteria) this;
        }

        public Criteria andDnoEqualTo(String value) {
            addCriterion("DNo =", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoNotEqualTo(String value) {
            addCriterion("DNo <>", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoGreaterThan(String value) {
            addCriterion("DNo >", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoGreaterThanOrEqualTo(String value) {
            addCriterion("DNo >=", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoLessThan(String value) {
            addCriterion("DNo <", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoLessThanOrEqualTo(String value) {
            addCriterion("DNo <=", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoLike(String value) {
            addCriterion("DNo like", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoNotLike(String value) {
            addCriterion("DNo not like", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoIn(List<String> values) {
            addCriterion("DNo in", values, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoNotIn(List<String> values) {
            addCriterion("DNo not in", values, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoBetween(String value1, String value2) {
            addCriterion("DNo between", value1, value2, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoNotBetween(String value1, String value2) {
            addCriterion("DNo not between", value1, value2, "dno");
            return (Criteria) this;
        }

        public Criteria andDnameIsNull() {
            addCriterion("DName is null");
            return (Criteria) this;
        }

        public Criteria andDnameIsNotNull() {
            addCriterion("DName is not null");
            return (Criteria) this;
        }

        public Criteria andDnameEqualTo(String value) {
            addCriterion("DName =", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotEqualTo(String value) {
            addCriterion("DName <>", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThan(String value) {
            addCriterion("DName >", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThanOrEqualTo(String value) {
            addCriterion("DName >=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThan(String value) {
            addCriterion("DName <", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThanOrEqualTo(String value) {
            addCriterion("DName <=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLike(String value) {
            addCriterion("DName like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotLike(String value) {
            addCriterion("DName not like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameIn(List<String> values) {
            addCriterion("DName in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotIn(List<String> values) {
            addCriterion("DName not in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameBetween(String value1, String value2) {
            addCriterion("DName between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotBetween(String value1, String value2) {
            addCriterion("DName not between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDsexIsNull() {
            addCriterion("DSex is null");
            return (Criteria) this;
        }

        public Criteria andDsexIsNotNull() {
            addCriterion("DSex is not null");
            return (Criteria) this;
        }

        public Criteria andDsexEqualTo(String value) {
            addCriterion("DSex =", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexNotEqualTo(String value) {
            addCriterion("DSex <>", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexGreaterThan(String value) {
            addCriterion("DSex >", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexGreaterThanOrEqualTo(String value) {
            addCriterion("DSex >=", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexLessThan(String value) {
            addCriterion("DSex <", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexLessThanOrEqualTo(String value) {
            addCriterion("DSex <=", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexLike(String value) {
            addCriterion("DSex like", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexNotLike(String value) {
            addCriterion("DSex not like", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexIn(List<String> values) {
            addCriterion("DSex in", values, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexNotIn(List<String> values) {
            addCriterion("DSex not in", values, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexBetween(String value1, String value2) {
            addCriterion("DSex between", value1, value2, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexNotBetween(String value1, String value2) {
            addCriterion("DSex not between", value1, value2, "dsex");
            return (Criteria) this;
        }

        public Criteria andDageIsNull() {
            addCriterion("DAge is null");
            return (Criteria) this;
        }

        public Criteria andDageIsNotNull() {
            addCriterion("DAge is not null");
            return (Criteria) this;
        }

        public Criteria andDageEqualTo(Integer value) {
            addCriterion("DAge =", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageNotEqualTo(Integer value) {
            addCriterion("DAge <>", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageGreaterThan(Integer value) {
            addCriterion("DAge >", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageGreaterThanOrEqualTo(Integer value) {
            addCriterion("DAge >=", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageLessThan(Integer value) {
            addCriterion("DAge <", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageLessThanOrEqualTo(Integer value) {
            addCriterion("DAge <=", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageIn(List<Integer> values) {
            addCriterion("DAge in", values, "dage");
            return (Criteria) this;
        }

        public Criteria andDageNotIn(List<Integer> values) {
            addCriterion("DAge not in", values, "dage");
            return (Criteria) this;
        }

        public Criteria andDageBetween(Integer value1, Integer value2) {
            addCriterion("DAge between", value1, value2, "dage");
            return (Criteria) this;
        }

        public Criteria andDageNotBetween(Integer value1, Integer value2) {
            addCriterion("DAge not between", value1, value2, "dage");
            return (Criteria) this;
        }

        public Criteria andRoomIsNull() {
            addCriterion("Room is null");
            return (Criteria) this;
        }

        public Criteria andRoomIsNotNull() {
            addCriterion("Room is not null");
            return (Criteria) this;
        }

        public Criteria andRoomEqualTo(String value) {
            addCriterion("Room =", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotEqualTo(String value) {
            addCriterion("Room <>", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThan(String value) {
            addCriterion("Room >", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThanOrEqualTo(String value) {
            addCriterion("Room >=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThan(String value) {
            addCriterion("Room <", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThanOrEqualTo(String value) {
            addCriterion("Room <=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLike(String value) {
            addCriterion("Room like", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotLike(String value) {
            addCriterion("Room not like", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomIn(List<String> values) {
            addCriterion("Room in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotIn(List<String> values) {
            addCriterion("Room not in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomBetween(String value1, String value2) {
            addCriterion("Room between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotBetween(String value1, String value2) {
            addCriterion("Room not between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
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
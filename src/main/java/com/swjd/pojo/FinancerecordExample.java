package com.swjd.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinancerecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinancerecordExample() {
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

        public Criteria andFinanceNoIsNull() {
            addCriterion("finance_no is null");
            return (Criteria) this;
        }

        public Criteria andFinanceNoIsNotNull() {
            addCriterion("finance_no is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceNoEqualTo(Integer value) {
            addCriterion("finance_no =", value, "financeNo");
            return (Criteria) this;
        }

        public Criteria andFinanceNoNotEqualTo(Integer value) {
            addCriterion("finance_no <>", value, "financeNo");
            return (Criteria) this;
        }

        public Criteria andFinanceNoGreaterThan(Integer value) {
            addCriterion("finance_no >", value, "financeNo");
            return (Criteria) this;
        }

        public Criteria andFinanceNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("finance_no >=", value, "financeNo");
            return (Criteria) this;
        }

        public Criteria andFinanceNoLessThan(Integer value) {
            addCriterion("finance_no <", value, "financeNo");
            return (Criteria) this;
        }

        public Criteria andFinanceNoLessThanOrEqualTo(Integer value) {
            addCriterion("finance_no <=", value, "financeNo");
            return (Criteria) this;
        }

        public Criteria andFinanceNoIn(List<Integer> values) {
            addCriterion("finance_no in", values, "financeNo");
            return (Criteria) this;
        }

        public Criteria andFinanceNoNotIn(List<Integer> values) {
            addCriterion("finance_no not in", values, "financeNo");
            return (Criteria) this;
        }

        public Criteria andFinanceNoBetween(Integer value1, Integer value2) {
            addCriterion("finance_no between", value1, value2, "financeNo");
            return (Criteria) this;
        }

        public Criteria andFinanceNoNotBetween(Integer value1, Integer value2) {
            addCriterion("finance_no not between", value1, value2, "financeNo");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNoIsNull() {
            addCriterion("prescription_no is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNoIsNotNull() {
            addCriterion("prescription_no is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNoEqualTo(Integer value) {
            addCriterion("prescription_no =", value, "prescriptionNo");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNoNotEqualTo(Integer value) {
            addCriterion("prescription_no <>", value, "prescriptionNo");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNoGreaterThan(Integer value) {
            addCriterion("prescription_no >", value, "prescriptionNo");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("prescription_no >=", value, "prescriptionNo");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNoLessThan(Integer value) {
            addCriterion("prescription_no <", value, "prescriptionNo");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNoLessThanOrEqualTo(Integer value) {
            addCriterion("prescription_no <=", value, "prescriptionNo");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNoIn(List<Integer> values) {
            addCriterion("prescription_no in", values, "prescriptionNo");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNoNotIn(List<Integer> values) {
            addCriterion("prescription_no not in", values, "prescriptionNo");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNoBetween(Integer value1, Integer value2) {
            addCriterion("prescription_no between", value1, value2, "prescriptionNo");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNoNotBetween(Integer value1, Integer value2) {
            addCriterion("prescription_no not between", value1, value2, "prescriptionNo");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTimeIsNull() {
            addCriterion("prescription_time is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTimeIsNotNull() {
            addCriterion("prescription_time is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTimeEqualTo(Date value) {
            addCriterion("prescription_time =", value, "prescriptionTime");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTimeNotEqualTo(Date value) {
            addCriterion("prescription_time <>", value, "prescriptionTime");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTimeGreaterThan(Date value) {
            addCriterion("prescription_time >", value, "prescriptionTime");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("prescription_time >=", value, "prescriptionTime");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTimeLessThan(Date value) {
            addCriterion("prescription_time <", value, "prescriptionTime");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTimeLessThanOrEqualTo(Date value) {
            addCriterion("prescription_time <=", value, "prescriptionTime");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTimeIn(List<Date> values) {
            addCriterion("prescription_time in", values, "prescriptionTime");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTimeNotIn(List<Date> values) {
            addCriterion("prescription_time not in", values, "prescriptionTime");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTimeBetween(Date value1, Date value2) {
            addCriterion("prescription_time between", value1, value2, "prescriptionTime");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTimeNotBetween(Date value1, Date value2) {
            addCriterion("prescription_time not between", value1, value2, "prescriptionTime");
            return (Criteria) this;
        }

        public Criteria andApplyPriceIsNull() {
            addCriterion("apply_price is null");
            return (Criteria) this;
        }

        public Criteria andApplyPriceIsNotNull() {
            addCriterion("apply_price is not null");
            return (Criteria) this;
        }

        public Criteria andApplyPriceEqualTo(Integer value) {
            addCriterion("apply_price =", value, "applyPrice");
            return (Criteria) this;
        }

        public Criteria andApplyPriceNotEqualTo(Integer value) {
            addCriterion("apply_price <>", value, "applyPrice");
            return (Criteria) this;
        }

        public Criteria andApplyPriceGreaterThan(Integer value) {
            addCriterion("apply_price >", value, "applyPrice");
            return (Criteria) this;
        }

        public Criteria andApplyPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_price >=", value, "applyPrice");
            return (Criteria) this;
        }

        public Criteria andApplyPriceLessThan(Integer value) {
            addCriterion("apply_price <", value, "applyPrice");
            return (Criteria) this;
        }

        public Criteria andApplyPriceLessThanOrEqualTo(Integer value) {
            addCriterion("apply_price <=", value, "applyPrice");
            return (Criteria) this;
        }

        public Criteria andApplyPriceIn(List<Integer> values) {
            addCriterion("apply_price in", values, "applyPrice");
            return (Criteria) this;
        }

        public Criteria andApplyPriceNotIn(List<Integer> values) {
            addCriterion("apply_price not in", values, "applyPrice");
            return (Criteria) this;
        }

        public Criteria andApplyPriceBetween(Integer value1, Integer value2) {
            addCriterion("apply_price between", value1, value2, "applyPrice");
            return (Criteria) this;
        }

        public Criteria andApplyPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_price not between", value1, value2, "applyPrice");
            return (Criteria) this;
        }

        public Criteria andSelfpriceIsNull() {
            addCriterion("selfprice is null");
            return (Criteria) this;
        }

        public Criteria andSelfpriceIsNotNull() {
            addCriterion("selfprice is not null");
            return (Criteria) this;
        }

        public Criteria andSelfpriceEqualTo(Integer value) {
            addCriterion("selfprice =", value, "selfprice");
            return (Criteria) this;
        }

        public Criteria andSelfpriceNotEqualTo(Integer value) {
            addCriterion("selfprice <>", value, "selfprice");
            return (Criteria) this;
        }

        public Criteria andSelfpriceGreaterThan(Integer value) {
            addCriterion("selfprice >", value, "selfprice");
            return (Criteria) this;
        }

        public Criteria andSelfpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("selfprice >=", value, "selfprice");
            return (Criteria) this;
        }

        public Criteria andSelfpriceLessThan(Integer value) {
            addCriterion("selfprice <", value, "selfprice");
            return (Criteria) this;
        }

        public Criteria andSelfpriceLessThanOrEqualTo(Integer value) {
            addCriterion("selfprice <=", value, "selfprice");
            return (Criteria) this;
        }

        public Criteria andSelfpriceIn(List<Integer> values) {
            addCriterion("selfprice in", values, "selfprice");
            return (Criteria) this;
        }

        public Criteria andSelfpriceNotIn(List<Integer> values) {
            addCriterion("selfprice not in", values, "selfprice");
            return (Criteria) this;
        }

        public Criteria andSelfpriceBetween(Integer value1, Integer value2) {
            addCriterion("selfprice between", value1, value2, "selfprice");
            return (Criteria) this;
        }

        public Criteria andSelfpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("selfprice not between", value1, value2, "selfprice");
            return (Criteria) this;
        }

        public Criteria andAmountpriceIsNull() {
            addCriterion("amountprice is null");
            return (Criteria) this;
        }

        public Criteria andAmountpriceIsNotNull() {
            addCriterion("amountprice is not null");
            return (Criteria) this;
        }

        public Criteria andAmountpriceEqualTo(Long value) {
            addCriterion("amountprice =", value, "amountprice");
            return (Criteria) this;
        }

        public Criteria andAmountpriceNotEqualTo(Long value) {
            addCriterion("amountprice <>", value, "amountprice");
            return (Criteria) this;
        }

        public Criteria andAmountpriceGreaterThan(Long value) {
            addCriterion("amountprice >", value, "amountprice");
            return (Criteria) this;
        }

        public Criteria andAmountpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("amountprice >=", value, "amountprice");
            return (Criteria) this;
        }

        public Criteria andAmountpriceLessThan(Long value) {
            addCriterion("amountprice <", value, "amountprice");
            return (Criteria) this;
        }

        public Criteria andAmountpriceLessThanOrEqualTo(Long value) {
            addCriterion("amountprice <=", value, "amountprice");
            return (Criteria) this;
        }

        public Criteria andAmountpriceIn(List<Long> values) {
            addCriterion("amountprice in", values, "amountprice");
            return (Criteria) this;
        }

        public Criteria andAmountpriceNotIn(List<Long> values) {
            addCriterion("amountprice not in", values, "amountprice");
            return (Criteria) this;
        }

        public Criteria andAmountpriceBetween(Long value1, Long value2) {
            addCriterion("amountprice between", value1, value2, "amountprice");
            return (Criteria) this;
        }

        public Criteria andAmountpriceNotBetween(Long value1, Long value2) {
            addCriterion("amountprice not between", value1, value2, "amountprice");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIsNull() {
            addCriterion("doctor_name is null");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIsNotNull() {
            addCriterion("doctor_name is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorNameEqualTo(String value) {
            addCriterion("doctor_name =", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotEqualTo(String value) {
            addCriterion("doctor_name <>", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameGreaterThan(String value) {
            addCriterion("doctor_name >", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_name >=", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLessThan(String value) {
            addCriterion("doctor_name <", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("doctor_name <=", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLike(String value) {
            addCriterion("doctor_name like", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotLike(String value) {
            addCriterion("doctor_name not like", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIn(List<String> values) {
            addCriterion("doctor_name in", values, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotIn(List<String> values) {
            addCriterion("doctor_name not in", values, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameBetween(String value1, String value2) {
            addCriterion("doctor_name between", value1, value2, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotBetween(String value1, String value2) {
            addCriterion("doctor_name not between", value1, value2, "doctorName");
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
package com.pan.example.testspringbootdemo.models;

import java.util.ArrayList;
import java.util.List;

public class TbgamesettingExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbGameSetting
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbGameSetting
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbGameSetting
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGameSetting
     *
     * @mbggenerated
     */
    public TbgamesettingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGameSetting
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGameSetting
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGameSetting
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGameSetting
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGameSetting
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGameSetting
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGameSetting
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGameSetting
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGameSetting
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGameSetting
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbGameSetting
     *
     * @mbggenerated
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSettingKeyIsNull() {
            addCriterion("settingKey is null");
            return (Criteria) this;
        }

        public Criteria andSettingKeyIsNotNull() {
            addCriterion("settingKey is not null");
            return (Criteria) this;
        }

        public Criteria andSettingKeyEqualTo(String value) {
            addCriterion("settingKey =", value, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingKeyNotEqualTo(String value) {
            addCriterion("settingKey <>", value, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingKeyGreaterThan(String value) {
            addCriterion("settingKey >", value, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingKeyGreaterThanOrEqualTo(String value) {
            addCriterion("settingKey >=", value, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingKeyLessThan(String value) {
            addCriterion("settingKey <", value, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingKeyLessThanOrEqualTo(String value) {
            addCriterion("settingKey <=", value, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingKeyLike(String value) {
            addCriterion("settingKey like", value, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingKeyNotLike(String value) {
            addCriterion("settingKey not like", value, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingKeyIn(List<String> values) {
            addCriterion("settingKey in", values, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingKeyNotIn(List<String> values) {
            addCriterion("settingKey not in", values, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingKeyBetween(String value1, String value2) {
            addCriterion("settingKey between", value1, value2, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingKeyNotBetween(String value1, String value2) {
            addCriterion("settingKey not between", value1, value2, "settingKey");
            return (Criteria) this;
        }

        public Criteria andSettingValueIsNull() {
            addCriterion("settingValue is null");
            return (Criteria) this;
        }

        public Criteria andSettingValueIsNotNull() {
            addCriterion("settingValue is not null");
            return (Criteria) this;
        }

        public Criteria andSettingValueEqualTo(Integer value) {
            addCriterion("settingValue =", value, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueNotEqualTo(Integer value) {
            addCriterion("settingValue <>", value, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueGreaterThan(Integer value) {
            addCriterion("settingValue >", value, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("settingValue >=", value, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueLessThan(Integer value) {
            addCriterion("settingValue <", value, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueLessThanOrEqualTo(Integer value) {
            addCriterion("settingValue <=", value, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueIn(List<Integer> values) {
            addCriterion("settingValue in", values, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueNotIn(List<Integer> values) {
            addCriterion("settingValue not in", values, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueBetween(Integer value1, Integer value2) {
            addCriterion("settingValue between", value1, value2, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueNotBetween(Integer value1, Integer value2) {
            addCriterion("settingValue not between", value1, value2, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingInfoIsNull() {
            addCriterion("settingInfo is null");
            return (Criteria) this;
        }

        public Criteria andSettingInfoIsNotNull() {
            addCriterion("settingInfo is not null");
            return (Criteria) this;
        }

        public Criteria andSettingInfoEqualTo(String value) {
            addCriterion("settingInfo =", value, "settingInfo");
            return (Criteria) this;
        }

        public Criteria andSettingInfoNotEqualTo(String value) {
            addCriterion("settingInfo <>", value, "settingInfo");
            return (Criteria) this;
        }

        public Criteria andSettingInfoGreaterThan(String value) {
            addCriterion("settingInfo >", value, "settingInfo");
            return (Criteria) this;
        }

        public Criteria andSettingInfoGreaterThanOrEqualTo(String value) {
            addCriterion("settingInfo >=", value, "settingInfo");
            return (Criteria) this;
        }

        public Criteria andSettingInfoLessThan(String value) {
            addCriterion("settingInfo <", value, "settingInfo");
            return (Criteria) this;
        }

        public Criteria andSettingInfoLessThanOrEqualTo(String value) {
            addCriterion("settingInfo <=", value, "settingInfo");
            return (Criteria) this;
        }

        public Criteria andSettingInfoLike(String value) {
            addCriterion("settingInfo like", value, "settingInfo");
            return (Criteria) this;
        }

        public Criteria andSettingInfoNotLike(String value) {
            addCriterion("settingInfo not like", value, "settingInfo");
            return (Criteria) this;
        }

        public Criteria andSettingInfoIn(List<String> values) {
            addCriterion("settingInfo in", values, "settingInfo");
            return (Criteria) this;
        }

        public Criteria andSettingInfoNotIn(List<String> values) {
            addCriterion("settingInfo not in", values, "settingInfo");
            return (Criteria) this;
        }

        public Criteria andSettingInfoBetween(String value1, String value2) {
            addCriterion("settingInfo between", value1, value2, "settingInfo");
            return (Criteria) this;
        }

        public Criteria andSettingInfoNotBetween(String value1, String value2) {
            addCriterion("settingInfo not between", value1, value2, "settingInfo");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNull() {
            addCriterion("areaid is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("areaid is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(Integer value) {
            addCriterion("areaid =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(Integer value) {
            addCriterion("areaid <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(Integer value) {
            addCriterion("areaid >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("areaid >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(Integer value) {
            addCriterion("areaid <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(Integer value) {
            addCriterion("areaid <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<Integer> values) {
            addCriterion("areaid in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<Integer> values) {
            addCriterion("areaid not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(Integer value1, Integer value2) {
            addCriterion("areaid between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(Integer value1, Integer value2) {
            addCriterion("areaid not between", value1, value2, "areaid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbGameSetting
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbGameSetting
     *
     * @mbggenerated
     */
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
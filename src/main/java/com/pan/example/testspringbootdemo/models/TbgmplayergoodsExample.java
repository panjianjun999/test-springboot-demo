package com.pan.example.testspringbootdemo.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbgmplayergoodsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbGmPlayerGoods
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbGmPlayerGoods
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbGmPlayerGoods
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerGoods
     *
     * @mbggenerated
     */
    public TbgmplayergoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerGoods
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerGoods
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerGoods
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerGoods
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerGoods
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerGoods
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerGoods
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
     * This method corresponds to the database table tbGmPlayerGoods
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
     * This method corresponds to the database table tbGmPlayerGoods
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerGoods
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
     * This class corresponds to the database table tbGmPlayerGoods
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIsNull() {
            addCriterion("playerId is null");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIsNotNull() {
            addCriterion("playerId is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerIdEqualTo(Long value) {
            addCriterion("playerId =", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotEqualTo(Long value) {
            addCriterion("playerId <>", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdGreaterThan(Long value) {
            addCriterion("playerId >", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("playerId >=", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdLessThan(Long value) {
            addCriterion("playerId <", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdLessThanOrEqualTo(Long value) {
            addCriterion("playerId <=", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIn(List<Long> values) {
            addCriterion("playerId in", values, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotIn(List<Long> values) {
            addCriterion("playerId not in", values, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdBetween(Long value1, Long value2) {
            addCriterion("playerId between", value1, value2, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotBetween(Long value1, Long value2) {
            addCriterion("playerId not between", value1, value2, "playerId");
            return (Criteria) this;
        }

        public Criteria andGiveAwardStringIsNull() {
            addCriterion("giveAwardString is null");
            return (Criteria) this;
        }

        public Criteria andGiveAwardStringIsNotNull() {
            addCriterion("giveAwardString is not null");
            return (Criteria) this;
        }

        public Criteria andGiveAwardStringEqualTo(String value) {
            addCriterion("giveAwardString =", value, "giveAwardString");
            return (Criteria) this;
        }

        public Criteria andGiveAwardStringNotEqualTo(String value) {
            addCriterion("giveAwardString <>", value, "giveAwardString");
            return (Criteria) this;
        }

        public Criteria andGiveAwardStringGreaterThan(String value) {
            addCriterion("giveAwardString >", value, "giveAwardString");
            return (Criteria) this;
        }

        public Criteria andGiveAwardStringGreaterThanOrEqualTo(String value) {
            addCriterion("giveAwardString >=", value, "giveAwardString");
            return (Criteria) this;
        }

        public Criteria andGiveAwardStringLessThan(String value) {
            addCriterion("giveAwardString <", value, "giveAwardString");
            return (Criteria) this;
        }

        public Criteria andGiveAwardStringLessThanOrEqualTo(String value) {
            addCriterion("giveAwardString <=", value, "giveAwardString");
            return (Criteria) this;
        }

        public Criteria andGiveAwardStringLike(String value) {
            addCriterion("giveAwardString like", value, "giveAwardString");
            return (Criteria) this;
        }

        public Criteria andGiveAwardStringNotLike(String value) {
            addCriterion("giveAwardString not like", value, "giveAwardString");
            return (Criteria) this;
        }

        public Criteria andGiveAwardStringIn(List<String> values) {
            addCriterion("giveAwardString in", values, "giveAwardString");
            return (Criteria) this;
        }

        public Criteria andGiveAwardStringNotIn(List<String> values) {
            addCriterion("giveAwardString not in", values, "giveAwardString");
            return (Criteria) this;
        }

        public Criteria andGiveAwardStringBetween(String value1, String value2) {
            addCriterion("giveAwardString between", value1, value2, "giveAwardString");
            return (Criteria) this;
        }

        public Criteria andGiveAwardStringNotBetween(String value1, String value2) {
            addCriterion("giveAwardString not between", value1, value2, "giveAwardString");
            return (Criteria) this;
        }

        public Criteria andProposerIsNull() {
            addCriterion("proposer is null");
            return (Criteria) this;
        }

        public Criteria andProposerIsNotNull() {
            addCriterion("proposer is not null");
            return (Criteria) this;
        }

        public Criteria andProposerEqualTo(String value) {
            addCriterion("proposer =", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotEqualTo(String value) {
            addCriterion("proposer <>", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerGreaterThan(String value) {
            addCriterion("proposer >", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerGreaterThanOrEqualTo(String value) {
            addCriterion("proposer >=", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLessThan(String value) {
            addCriterion("proposer <", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLessThanOrEqualTo(String value) {
            addCriterion("proposer <=", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLike(String value) {
            addCriterion("proposer like", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotLike(String value) {
            addCriterion("proposer not like", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerIn(List<String> values) {
            addCriterion("proposer in", values, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotIn(List<String> values) {
            addCriterion("proposer not in", values, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerBetween(String value1, String value2) {
            addCriterion("proposer between", value1, value2, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotBetween(String value1, String value2) {
            addCriterion("proposer not between", value1, value2, "proposer");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNull() {
            addCriterion("creatTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("creatTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterion("creatTime =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterion("creatTime <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterion("creatTime >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creatTime >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterion("creatTime <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("creatTime <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterion("creatTime in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterion("creatTime not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterion("creatTime between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("creatTime not between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andAuthUserIsNull() {
            addCriterion("authUser is null");
            return (Criteria) this;
        }

        public Criteria andAuthUserIsNotNull() {
            addCriterion("authUser is not null");
            return (Criteria) this;
        }

        public Criteria andAuthUserEqualTo(String value) {
            addCriterion("authUser =", value, "authUser");
            return (Criteria) this;
        }

        public Criteria andAuthUserNotEqualTo(String value) {
            addCriterion("authUser <>", value, "authUser");
            return (Criteria) this;
        }

        public Criteria andAuthUserGreaterThan(String value) {
            addCriterion("authUser >", value, "authUser");
            return (Criteria) this;
        }

        public Criteria andAuthUserGreaterThanOrEqualTo(String value) {
            addCriterion("authUser >=", value, "authUser");
            return (Criteria) this;
        }

        public Criteria andAuthUserLessThan(String value) {
            addCriterion("authUser <", value, "authUser");
            return (Criteria) this;
        }

        public Criteria andAuthUserLessThanOrEqualTo(String value) {
            addCriterion("authUser <=", value, "authUser");
            return (Criteria) this;
        }

        public Criteria andAuthUserLike(String value) {
            addCriterion("authUser like", value, "authUser");
            return (Criteria) this;
        }

        public Criteria andAuthUserNotLike(String value) {
            addCriterion("authUser not like", value, "authUser");
            return (Criteria) this;
        }

        public Criteria andAuthUserIn(List<String> values) {
            addCriterion("authUser in", values, "authUser");
            return (Criteria) this;
        }

        public Criteria andAuthUserNotIn(List<String> values) {
            addCriterion("authUser not in", values, "authUser");
            return (Criteria) this;
        }

        public Criteria andAuthUserBetween(String value1, String value2) {
            addCriterion("authUser between", value1, value2, "authUser");
            return (Criteria) this;
        }

        public Criteria andAuthUserNotBetween(String value1, String value2) {
            addCriterion("authUser not between", value1, value2, "authUser");
            return (Criteria) this;
        }

        public Criteria andAuthTimeIsNull() {
            addCriterion("authTime is null");
            return (Criteria) this;
        }

        public Criteria andAuthTimeIsNotNull() {
            addCriterion("authTime is not null");
            return (Criteria) this;
        }

        public Criteria andAuthTimeEqualTo(Date value) {
            addCriterion("authTime =", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeNotEqualTo(Date value) {
            addCriterion("authTime <>", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeGreaterThan(Date value) {
            addCriterion("authTime >", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("authTime >=", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeLessThan(Date value) {
            addCriterion("authTime <", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeLessThanOrEqualTo(Date value) {
            addCriterion("authTime <=", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeIn(List<Date> values) {
            addCriterion("authTime in", values, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeNotIn(List<Date> values) {
            addCriterion("authTime not in", values, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeBetween(Date value1, Date value2) {
            addCriterion("authTime between", value1, value2, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeNotBetween(Date value1, Date value2) {
            addCriterion("authTime not between", value1, value2, "authTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbGmPlayerGoods
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
     * This class corresponds to the database table tbGmPlayerGoods
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
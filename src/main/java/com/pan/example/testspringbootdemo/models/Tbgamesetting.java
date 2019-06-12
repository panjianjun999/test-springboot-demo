package com.pan.example.testspringbootdemo.models;

import java.io.Serializable;

public class Tbgamesetting implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGameSetting.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGameSetting.settingKey
     *
     * @mbggenerated
     */
    private String settingKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGameSetting.settingValue
     *
     * @mbggenerated
     */
    private Integer settingValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGameSetting.settingInfo
     *
     * @mbggenerated
     */
    private String settingInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGameSetting.areaid
     *
     * @mbggenerated
     */
    private Integer areaid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbGameSetting
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGameSetting.id
     *
     * @return the value of tbGameSetting.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGameSetting.id
     *
     * @param id the value for tbGameSetting.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGameSetting.settingKey
     *
     * @return the value of tbGameSetting.settingKey
     *
     * @mbggenerated
     */
    public String getSettingKey() {
        return settingKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGameSetting.settingKey
     *
     * @param settingKey the value for tbGameSetting.settingKey
     *
     * @mbggenerated
     */
    public void setSettingKey(String settingKey) {
        this.settingKey = settingKey == null ? null : settingKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGameSetting.settingValue
     *
     * @return the value of tbGameSetting.settingValue
     *
     * @mbggenerated
     */
    public Integer getSettingValue() {
        return settingValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGameSetting.settingValue
     *
     * @param settingValue the value for tbGameSetting.settingValue
     *
     * @mbggenerated
     */
    public void setSettingValue(Integer settingValue) {
        this.settingValue = settingValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGameSetting.settingInfo
     *
     * @return the value of tbGameSetting.settingInfo
     *
     * @mbggenerated
     */
    public String getSettingInfo() {
        return settingInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGameSetting.settingInfo
     *
     * @param settingInfo the value for tbGameSetting.settingInfo
     *
     * @mbggenerated
     */
    public void setSettingInfo(String settingInfo) {
        this.settingInfo = settingInfo == null ? null : settingInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGameSetting.areaid
     *
     * @return the value of tbGameSetting.areaid
     *
     * @mbggenerated
     */
    public Integer getAreaid() {
        return areaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGameSetting.areaid
     *
     * @param areaid the value for tbGameSetting.areaid
     *
     * @mbggenerated
     */
    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGameSetting
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", settingKey=").append(settingKey);
        sb.append(", settingValue=").append(settingValue);
        sb.append(", settingInfo=").append(settingInfo);
        sb.append(", areaid=").append(areaid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
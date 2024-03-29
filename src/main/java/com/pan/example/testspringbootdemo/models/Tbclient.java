package com.pan.example.testspringbootdemo.models;

import java.io.Serializable;
import java.util.Date;

public class Tbclient implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbClient.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbClient.createDate
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbClient.lastLoginTime
     *
     * @mbggenerated
     */
    private Date lastLoginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbClient.regChannelId
     *
     * @mbggenerated
     */
    private Integer regChannelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbClient.regSubChannelId
     *
     * @mbggenerated
     */
    private Integer regSubChannelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbClient.terminalType
     *
     * @mbggenerated
     */
    private Integer terminalType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbClient.osversion
     *
     * @mbggenerated
     */
    private String osversion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbClient.edition
     *
     * @mbggenerated
     */
    private Integer edition;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbClient
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbClient.id
     *
     * @return the value of tbClient.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbClient.id
     *
     * @param id the value for tbClient.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbClient.createDate
     *
     * @return the value of tbClient.createDate
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbClient.createDate
     *
     * @param createDate the value for tbClient.createDate
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbClient.lastLoginTime
     *
     * @return the value of tbClient.lastLoginTime
     *
     * @mbggenerated
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbClient.lastLoginTime
     *
     * @param lastLoginTime the value for tbClient.lastLoginTime
     *
     * @mbggenerated
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbClient.regChannelId
     *
     * @return the value of tbClient.regChannelId
     *
     * @mbggenerated
     */
    public Integer getRegChannelId() {
        return regChannelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbClient.regChannelId
     *
     * @param regChannelId the value for tbClient.regChannelId
     *
     * @mbggenerated
     */
    public void setRegChannelId(Integer regChannelId) {
        this.regChannelId = regChannelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbClient.regSubChannelId
     *
     * @return the value of tbClient.regSubChannelId
     *
     * @mbggenerated
     */
    public Integer getRegSubChannelId() {
        return regSubChannelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbClient.regSubChannelId
     *
     * @param regSubChannelId the value for tbClient.regSubChannelId
     *
     * @mbggenerated
     */
    public void setRegSubChannelId(Integer regSubChannelId) {
        this.regSubChannelId = regSubChannelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbClient.terminalType
     *
     * @return the value of tbClient.terminalType
     *
     * @mbggenerated
     */
    public Integer getTerminalType() {
        return terminalType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbClient.terminalType
     *
     * @param terminalType the value for tbClient.terminalType
     *
     * @mbggenerated
     */
    public void setTerminalType(Integer terminalType) {
        this.terminalType = terminalType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbClient.osversion
     *
     * @return the value of tbClient.osversion
     *
     * @mbggenerated
     */
    public String getOsversion() {
        return osversion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbClient.osversion
     *
     * @param osversion the value for tbClient.osversion
     *
     * @mbggenerated
     */
    public void setOsversion(String osversion) {
        this.osversion = osversion == null ? null : osversion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbClient.edition
     *
     * @return the value of tbClient.edition
     *
     * @mbggenerated
     */
    public Integer getEdition() {
        return edition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbClient.edition
     *
     * @param edition the value for tbClient.edition
     *
     * @mbggenerated
     */
    public void setEdition(Integer edition) {
        this.edition = edition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbClient
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
        sb.append(", createDate=").append(createDate);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", regChannelId=").append(regChannelId);
        sb.append(", regSubChannelId=").append(regSubChannelId);
        sb.append(", terminalType=").append(terminalType);
        sb.append(", osversion=").append(osversion);
        sb.append(", edition=").append(edition);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
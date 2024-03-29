package com.pan.example.testspringbootdemo.models;

import java.io.Serializable;
import java.util.Date;

public class Tbgmsendmail implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmSendMail.groupId
     *
     * @mbggenerated
     */
    private Long groupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmSendMail.serverId
     *
     * @mbggenerated
     */
    private Integer serverId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmSendMail.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmSendMail.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmSendMail.playerType
     *
     * @mbggenerated
     */
    private Byte playerType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmSendMail.minLevel
     *
     * @mbggenerated
     */
    private Integer minLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmSendMail.maxLevel
     *
     * @mbggenerated
     */
    private Integer maxLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmSendMail.sendName
     *
     * @mbggenerated
     */
    private String sendName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmSendMail.sendType
     *
     * @mbggenerated
     */
    private Byte sendType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmSendMail.sendTime
     *
     * @mbggenerated
     */
    private Date sendTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmSendMail.endTime
     *
     * @mbggenerated
     */
    private Date endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmSendMail.succeed
     *
     * @mbggenerated
     */
    private Byte succeed;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmSendMail.isValid
     *
     * @mbggenerated
     */
    private Byte isValid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmSendMail.checkStatus
     *
     * @mbggenerated
     */
    private Byte checkStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmSendMail.checkTime
     *
     * @mbggenerated
     */
    private Date checkTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmSendMail.checkerName
     *
     * @mbggenerated
     */
    private String checkerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmSendMail.createTime
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmSendMail.sendSumNum
     *
     * @mbggenerated
     */
    private Integer sendSumNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmSendMail.succeedNum
     *
     * @mbggenerated
     */
    private Integer succeedNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmSendMail.extendParameter
     *
     * @mbggenerated
     */
    private String extendParameter;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmSendMail.giveAwardString
     *
     * @mbggenerated
     */
    private String giveAwardString;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbGmSendMail
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmSendMail.groupId
     *
     * @return the value of tbGmSendMail.groupId
     *
     * @mbggenerated
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmSendMail.groupId
     *
     * @param groupId the value for tbGmSendMail.groupId
     *
     * @mbggenerated
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmSendMail.serverId
     *
     * @return the value of tbGmSendMail.serverId
     *
     * @mbggenerated
     */
    public Integer getServerId() {
        return serverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmSendMail.serverId
     *
     * @param serverId the value for tbGmSendMail.serverId
     *
     * @mbggenerated
     */
    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmSendMail.title
     *
     * @return the value of tbGmSendMail.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmSendMail.title
     *
     * @param title the value for tbGmSendMail.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmSendMail.content
     *
     * @return the value of tbGmSendMail.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmSendMail.content
     *
     * @param content the value for tbGmSendMail.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmSendMail.playerType
     *
     * @return the value of tbGmSendMail.playerType
     *
     * @mbggenerated
     */
    public Byte getPlayerType() {
        return playerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmSendMail.playerType
     *
     * @param playerType the value for tbGmSendMail.playerType
     *
     * @mbggenerated
     */
    public void setPlayerType(Byte playerType) {
        this.playerType = playerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmSendMail.minLevel
     *
     * @return the value of tbGmSendMail.minLevel
     *
     * @mbggenerated
     */
    public Integer getMinLevel() {
        return minLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmSendMail.minLevel
     *
     * @param minLevel the value for tbGmSendMail.minLevel
     *
     * @mbggenerated
     */
    public void setMinLevel(Integer minLevel) {
        this.minLevel = minLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmSendMail.maxLevel
     *
     * @return the value of tbGmSendMail.maxLevel
     *
     * @mbggenerated
     */
    public Integer getMaxLevel() {
        return maxLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmSendMail.maxLevel
     *
     * @param maxLevel the value for tbGmSendMail.maxLevel
     *
     * @mbggenerated
     */
    public void setMaxLevel(Integer maxLevel) {
        this.maxLevel = maxLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmSendMail.sendName
     *
     * @return the value of tbGmSendMail.sendName
     *
     * @mbggenerated
     */
    public String getSendName() {
        return sendName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmSendMail.sendName
     *
     * @param sendName the value for tbGmSendMail.sendName
     *
     * @mbggenerated
     */
    public void setSendName(String sendName) {
        this.sendName = sendName == null ? null : sendName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmSendMail.sendType
     *
     * @return the value of tbGmSendMail.sendType
     *
     * @mbggenerated
     */
    public Byte getSendType() {
        return sendType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmSendMail.sendType
     *
     * @param sendType the value for tbGmSendMail.sendType
     *
     * @mbggenerated
     */
    public void setSendType(Byte sendType) {
        this.sendType = sendType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmSendMail.sendTime
     *
     * @return the value of tbGmSendMail.sendTime
     *
     * @mbggenerated
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmSendMail.sendTime
     *
     * @param sendTime the value for tbGmSendMail.sendTime
     *
     * @mbggenerated
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmSendMail.endTime
     *
     * @return the value of tbGmSendMail.endTime
     *
     * @mbggenerated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmSendMail.endTime
     *
     * @param endTime the value for tbGmSendMail.endTime
     *
     * @mbggenerated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmSendMail.succeed
     *
     * @return the value of tbGmSendMail.succeed
     *
     * @mbggenerated
     */
    public Byte getSucceed() {
        return succeed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmSendMail.succeed
     *
     * @param succeed the value for tbGmSendMail.succeed
     *
     * @mbggenerated
     */
    public void setSucceed(Byte succeed) {
        this.succeed = succeed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmSendMail.isValid
     *
     * @return the value of tbGmSendMail.isValid
     *
     * @mbggenerated
     */
    public Byte getIsValid() {
        return isValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmSendMail.isValid
     *
     * @param isValid the value for tbGmSendMail.isValid
     *
     * @mbggenerated
     */
    public void setIsValid(Byte isValid) {
        this.isValid = isValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmSendMail.checkStatus
     *
     * @return the value of tbGmSendMail.checkStatus
     *
     * @mbggenerated
     */
    public Byte getCheckStatus() {
        return checkStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmSendMail.checkStatus
     *
     * @param checkStatus the value for tbGmSendMail.checkStatus
     *
     * @mbggenerated
     */
    public void setCheckStatus(Byte checkStatus) {
        this.checkStatus = checkStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmSendMail.checkTime
     *
     * @return the value of tbGmSendMail.checkTime
     *
     * @mbggenerated
     */
    public Date getCheckTime() {
        return checkTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmSendMail.checkTime
     *
     * @param checkTime the value for tbGmSendMail.checkTime
     *
     * @mbggenerated
     */
    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmSendMail.checkerName
     *
     * @return the value of tbGmSendMail.checkerName
     *
     * @mbggenerated
     */
    public String getCheckerName() {
        return checkerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmSendMail.checkerName
     *
     * @param checkerName the value for tbGmSendMail.checkerName
     *
     * @mbggenerated
     */
    public void setCheckerName(String checkerName) {
        this.checkerName = checkerName == null ? null : checkerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmSendMail.createTime
     *
     * @return the value of tbGmSendMail.createTime
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmSendMail.createTime
     *
     * @param createTime the value for tbGmSendMail.createTime
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmSendMail.sendSumNum
     *
     * @return the value of tbGmSendMail.sendSumNum
     *
     * @mbggenerated
     */
    public Integer getSendSumNum() {
        return sendSumNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmSendMail.sendSumNum
     *
     * @param sendSumNum the value for tbGmSendMail.sendSumNum
     *
     * @mbggenerated
     */
    public void setSendSumNum(Integer sendSumNum) {
        this.sendSumNum = sendSumNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmSendMail.succeedNum
     *
     * @return the value of tbGmSendMail.succeedNum
     *
     * @mbggenerated
     */
    public Integer getSucceedNum() {
        return succeedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmSendMail.succeedNum
     *
     * @param succeedNum the value for tbGmSendMail.succeedNum
     *
     * @mbggenerated
     */
    public void setSucceedNum(Integer succeedNum) {
        this.succeedNum = succeedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmSendMail.extendParameter
     *
     * @return the value of tbGmSendMail.extendParameter
     *
     * @mbggenerated
     */
    public String getExtendParameter() {
        return extendParameter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmSendMail.extendParameter
     *
     * @param extendParameter the value for tbGmSendMail.extendParameter
     *
     * @mbggenerated
     */
    public void setExtendParameter(String extendParameter) {
        this.extendParameter = extendParameter == null ? null : extendParameter.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmSendMail.giveAwardString
     *
     * @return the value of tbGmSendMail.giveAwardString
     *
     * @mbggenerated
     */
    public String getGiveAwardString() {
        return giveAwardString;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmSendMail.giveAwardString
     *
     * @param giveAwardString the value for tbGmSendMail.giveAwardString
     *
     * @mbggenerated
     */
    public void setGiveAwardString(String giveAwardString) {
        this.giveAwardString = giveAwardString == null ? null : giveAwardString.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmSendMail
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", groupId=").append(groupId);
        sb.append(", serverId=").append(serverId);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", playerType=").append(playerType);
        sb.append(", minLevel=").append(minLevel);
        sb.append(", maxLevel=").append(maxLevel);
        sb.append(", sendName=").append(sendName);
        sb.append(", sendType=").append(sendType);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", succeed=").append(succeed);
        sb.append(", isValid=").append(isValid);
        sb.append(", checkStatus=").append(checkStatus);
        sb.append(", checkTime=").append(checkTime);
        sb.append(", checkerName=").append(checkerName);
        sb.append(", createTime=").append(createTime);
        sb.append(", sendSumNum=").append(sendSumNum);
        sb.append(", succeedNum=").append(succeedNum);
        sb.append(", extendParameter=").append(extendParameter);
        sb.append(", giveAwardString=").append(giveAwardString);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
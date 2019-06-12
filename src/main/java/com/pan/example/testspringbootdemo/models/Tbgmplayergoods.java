package com.pan.example.testspringbootdemo.models;

import java.io.Serializable;
import java.util.Date;

public class Tbgmplayergoods implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmPlayerGoods.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmPlayerGoods.playerId
     *
     * @mbggenerated
     */
    private Long playerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmPlayerGoods.giveAwardString
     *
     * @mbggenerated
     */
    private String giveAwardString;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmPlayerGoods.proposer
     *
     * @mbggenerated
     */
    private String proposer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmPlayerGoods.creatTime
     *
     * @mbggenerated
     */
    private Date creatTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmPlayerGoods.authUser
     *
     * @mbggenerated
     */
    private String authUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmPlayerGoods.authTime
     *
     * @mbggenerated
     */
    private Date authTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGmPlayerGoods.status
     *
     * @mbggenerated
     */
    private Short status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbGmPlayerGoods
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmPlayerGoods.id
     *
     * @return the value of tbGmPlayerGoods.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmPlayerGoods.id
     *
     * @param id the value for tbGmPlayerGoods.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmPlayerGoods.playerId
     *
     * @return the value of tbGmPlayerGoods.playerId
     *
     * @mbggenerated
     */
    public Long getPlayerId() {
        return playerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmPlayerGoods.playerId
     *
     * @param playerId the value for tbGmPlayerGoods.playerId
     *
     * @mbggenerated
     */
    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmPlayerGoods.giveAwardString
     *
     * @return the value of tbGmPlayerGoods.giveAwardString
     *
     * @mbggenerated
     */
    public String getGiveAwardString() {
        return giveAwardString;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmPlayerGoods.giveAwardString
     *
     * @param giveAwardString the value for tbGmPlayerGoods.giveAwardString
     *
     * @mbggenerated
     */
    public void setGiveAwardString(String giveAwardString) {
        this.giveAwardString = giveAwardString == null ? null : giveAwardString.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmPlayerGoods.proposer
     *
     * @return the value of tbGmPlayerGoods.proposer
     *
     * @mbggenerated
     */
    public String getProposer() {
        return proposer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmPlayerGoods.proposer
     *
     * @param proposer the value for tbGmPlayerGoods.proposer
     *
     * @mbggenerated
     */
    public void setProposer(String proposer) {
        this.proposer = proposer == null ? null : proposer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmPlayerGoods.creatTime
     *
     * @return the value of tbGmPlayerGoods.creatTime
     *
     * @mbggenerated
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmPlayerGoods.creatTime
     *
     * @param creatTime the value for tbGmPlayerGoods.creatTime
     *
     * @mbggenerated
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmPlayerGoods.authUser
     *
     * @return the value of tbGmPlayerGoods.authUser
     *
     * @mbggenerated
     */
    public String getAuthUser() {
        return authUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmPlayerGoods.authUser
     *
     * @param authUser the value for tbGmPlayerGoods.authUser
     *
     * @mbggenerated
     */
    public void setAuthUser(String authUser) {
        this.authUser = authUser == null ? null : authUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmPlayerGoods.authTime
     *
     * @return the value of tbGmPlayerGoods.authTime
     *
     * @mbggenerated
     */
    public Date getAuthTime() {
        return authTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmPlayerGoods.authTime
     *
     * @param authTime the value for tbGmPlayerGoods.authTime
     *
     * @mbggenerated
     */
    public void setAuthTime(Date authTime) {
        this.authTime = authTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGmPlayerGoods.status
     *
     * @return the value of tbGmPlayerGoods.status
     *
     * @mbggenerated
     */
    public Short getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGmPlayerGoods.status
     *
     * @param status the value for tbGmPlayerGoods.status
     *
     * @mbggenerated
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGmPlayerGoods
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
        sb.append(", playerId=").append(playerId);
        sb.append(", giveAwardString=").append(giveAwardString);
        sb.append(", proposer=").append(proposer);
        sb.append(", creatTime=").append(creatTime);
        sb.append(", authUser=").append(authUser);
        sb.append(", authTime=").append(authTime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
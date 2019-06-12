package com.pan.example.testspringbootdemo.models;

import java.io.Serializable;

public class Tbgame implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGame.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGame.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGame.uuidIndex
     *
     * @mbggenerated
     */
    private Long uuidIndex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGame.info
     *
     * @mbggenerated
     */
    private String info;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbGame.managerLocalIp
     *
     * @mbggenerated
     */
    private String managerLocalIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbGame
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGame.id
     *
     * @return the value of tbGame.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGame.id
     *
     * @param id the value for tbGame.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGame.name
     *
     * @return the value of tbGame.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGame.name
     *
     * @param name the value for tbGame.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGame.uuidIndex
     *
     * @return the value of tbGame.uuidIndex
     *
     * @mbggenerated
     */
    public Long getUuidIndex() {
        return uuidIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGame.uuidIndex
     *
     * @param uuidIndex the value for tbGame.uuidIndex
     *
     * @mbggenerated
     */
    public void setUuidIndex(Long uuidIndex) {
        this.uuidIndex = uuidIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGame.info
     *
     * @return the value of tbGame.info
     *
     * @mbggenerated
     */
    public String getInfo() {
        return info;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGame.info
     *
     * @param info the value for tbGame.info
     *
     * @mbggenerated
     */
    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbGame.managerLocalIp
     *
     * @return the value of tbGame.managerLocalIp
     *
     * @mbggenerated
     */
    public String getManagerLocalIp() {
        return managerLocalIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbGame.managerLocalIp
     *
     * @param managerLocalIp the value for tbGame.managerLocalIp
     *
     * @mbggenerated
     */
    public void setManagerLocalIp(String managerLocalIp) {
        this.managerLocalIp = managerLocalIp == null ? null : managerLocalIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbGame
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
        sb.append(", name=").append(name);
        sb.append(", uuidIndex=").append(uuidIndex);
        sb.append(", info=").append(info);
        sb.append(", managerLocalIp=").append(managerLocalIp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
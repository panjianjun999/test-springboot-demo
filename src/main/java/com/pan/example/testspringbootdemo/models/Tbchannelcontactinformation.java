package com.pan.example.testspringbootdemo.models;

import java.io.Serializable;

public class Tbchannelcontactinformation implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbChannelContactInformation.channel
     *
     * @mbggenerated
     */
    private Integer channel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbChannelContactInformation.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbChannelContactInformation.contact
     *
     * @mbggenerated
     */
    private String contact;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbChannelContactInformation.clientUpdateUrl
     *
     * @mbggenerated
     */
    private String clientUpdateUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbChannelContactInformation
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbChannelContactInformation.channel
     *
     * @return the value of tbChannelContactInformation.channel
     *
     * @mbggenerated
     */
    public Integer getChannel() {
        return channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbChannelContactInformation.channel
     *
     * @param channel the value for tbChannelContactInformation.channel
     *
     * @mbggenerated
     */
    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbChannelContactInformation.name
     *
     * @return the value of tbChannelContactInformation.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbChannelContactInformation.name
     *
     * @param name the value for tbChannelContactInformation.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbChannelContactInformation.contact
     *
     * @return the value of tbChannelContactInformation.contact
     *
     * @mbggenerated
     */
    public String getContact() {
        return contact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbChannelContactInformation.contact
     *
     * @param contact the value for tbChannelContactInformation.contact
     *
     * @mbggenerated
     */
    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbChannelContactInformation.clientUpdateUrl
     *
     * @return the value of tbChannelContactInformation.clientUpdateUrl
     *
     * @mbggenerated
     */
    public String getClientUpdateUrl() {
        return clientUpdateUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbChannelContactInformation.clientUpdateUrl
     *
     * @param clientUpdateUrl the value for tbChannelContactInformation.clientUpdateUrl
     *
     * @mbggenerated
     */
    public void setClientUpdateUrl(String clientUpdateUrl) {
        this.clientUpdateUrl = clientUpdateUrl == null ? null : clientUpdateUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbChannelContactInformation
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", channel=").append(channel);
        sb.append(", name=").append(name);
        sb.append(", contact=").append(contact);
        sb.append(", clientUpdateUrl=").append(clientUpdateUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
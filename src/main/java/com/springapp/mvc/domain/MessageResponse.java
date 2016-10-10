package com.springapp.mvc.domain;

import java.util.Date;

public class MessageResponse {
    private Integer id;

    private String messageid;

    private String messagename;

    private String mobilesOperator;

    private Integer operatorType;

    private String channelsname;

    private String channelsid;

    private String description;

    private Date currenttime;

    private String channelsResponseCode;

    private Integer channelsResponseTime;

    private Byte issuccess;

    private String mobiles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid;
    }

    public String getMessagename() {
        return messagename;
    }

    public void setMessagename(String messagename) {
        this.messagename = messagename;
    }

    public String getMobilesOperator() {
        return mobilesOperator;
    }

    public void setMobilesOperator(String mobilesOperator) {
        this.mobilesOperator = mobilesOperator;
    }

    public Integer getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public String getChannelsname() {
        return channelsname;
    }

    public void setChannelsname(String channelsname) {
        this.channelsname = channelsname;
    }

    public String getChannelsid() {
        return channelsid;
    }

    public void setChannelsid(String channelsid) {
        this.channelsid = channelsid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCurrenttime() {
        return currenttime;
    }

    public void setCurrenttime(Date currenttime) {
        this.currenttime = currenttime;
    }

    public String getChannelsResponseCode() {
        return channelsResponseCode;
    }

    public void setChannelsResponseCode(String channelsResponseCode) {
        this.channelsResponseCode = channelsResponseCode;
    }

    public Integer getChannelsResponseTime() {
        return channelsResponseTime;
    }

    public void setChannelsResponseTime(Integer channelsResponseTime) {
        this.channelsResponseTime = channelsResponseTime;
    }

    public Byte getIssuccess() {
        return issuccess;
    }

    public void setIssuccess(Byte issuccess) {
        this.issuccess = issuccess;
    }

    public String getMobiles() {
        return mobiles;
    }

    public void setMobiles(String mobiles) {
        this.mobiles = mobiles;
    }
}
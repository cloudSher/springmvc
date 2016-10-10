package com.springapp.mvc.domain;


import java.util.Date;

public class Caller {
    private Integer callerid;

    private String callername;

    private String type;

    private String description;

    private Date calltime;

    public Integer getCallerid() {
        return callerid;
    }

    public void setCallerid(Integer callerid) {
        this.callerid = callerid;
    }

    public String getCallername() {
        return callername;
    }

    public void setCallername(String callername) {
        this.callername = callername;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCalltime() {
        return calltime;
    }

    public void setCalltime(Date calltime) {
        this.calltime = calltime;
    }
}
package com.example.perseus.remindme.dto;

public class RemindRemark {

    private String remark;

    public RemindRemark(String title) {
        this.remark = title;
    }

    public String getTitle() {
        return remark;
    }

    public void setTitle(String title) {
        this.remark = title;
    }
}

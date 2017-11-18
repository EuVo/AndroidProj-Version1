package com.example.perseus.remindme.dto;

public class RemindDTO {

    private String title;
    private String remark;

    public RemindDTO(String title, String remark) {
        this.remark = remark;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public String getTitles() {
        return remark;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setTitles(String remark) {
        this.remark = remark;
    }
}

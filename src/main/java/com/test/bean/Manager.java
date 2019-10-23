package com.test.bean;

import java.io.Serializable;
import java.util.Date;

public class Manager implements Serializable {
    private Integer manager_id;

    private String manager_phone;

    private String manager_sex;

    private String manager_idcard;

    private Integer manager_createuser;

    private Date manager_createtime;

    private Date manager_lastmodify;

    private String manager_password;

    private Integer manager_state;

    private String manager_remark;

    private String manager_name;

    private String manager_img;

    private static final long serialVersionUID = 1L;

    public Integer getManager_id() {
        return manager_id;
    }

    public void setManager_id(Integer manager_id) {
        this.manager_id = manager_id;
    }

    public String getManager_phone() {
        return manager_phone;
    }

    public void setManager_phone(String manager_phone) {
        this.manager_phone = manager_phone == null ? null : manager_phone.trim();
    }

    public String getManager_sex() {
        return manager_sex;
    }

    public void setManager_sex(String manager_sex) {
        this.manager_sex = manager_sex == null ? null : manager_sex.trim();
    }

    public String getManager_idcard() {
        return manager_idcard;
    }

    public void setManager_idcard(String manager_idcard) {
        this.manager_idcard = manager_idcard == null ? null : manager_idcard.trim();
    }

    public Integer getManager_createuser() {
        return manager_createuser;
    }

    public void setManager_createuser(Integer manager_createuser) {
        this.manager_createuser = manager_createuser;
    }

    public Date getManager_createtime() {
        return manager_createtime;
    }

    public void setManager_createtime(Date manager_createtime) {
        this.manager_createtime = manager_createtime;
    }

    public Date getManager_lastmodify() {
        return manager_lastmodify;
    }

    public void setManager_lastmodify(Date manager_lastmodify) {
        this.manager_lastmodify = manager_lastmodify;
    }

    public String getManager_password() {
        return manager_password;
    }

    public void setManager_password(String manager_password) {
        this.manager_password = manager_password == null ? null : manager_password.trim();
    }

    public Integer getManager_state() {
        return manager_state;
    }

    public void setManager_state(Integer manager_state) {
        this.manager_state = manager_state;
    }

    public String getManager_remark() {
        return manager_remark;
    }

    public void setManager_remark(String manager_remark) {
        this.manager_remark = manager_remark == null ? null : manager_remark.trim();
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name == null ? null : manager_name.trim();
    }

    public String getManager_img() {
        return manager_img;
    }

    public void setManager_img(String manager_img) {
        this.manager_img = manager_img == null ? null : manager_img.trim();
    }
}
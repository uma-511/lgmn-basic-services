package com.lgmn.basicservices.api.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "lgmn_sms_code", schema = "shandian", catalog = "")
public class LgmnSmsCodeEntity implements Serializable {
    private int id;
    private String phone;
    private String code;
    private Timestamp sendTime;
    private Timestamp expireTime;
    private int isExprie;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "send_time")
    public Timestamp getSendTime() {
        return sendTime;
    }

    public void setSendTime(Timestamp sendTime) {
        this.sendTime = sendTime;
    }

    @Basic
    @Column(name = "expire_time")
    public Timestamp getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Timestamp expireTime) {
        this.expireTime = expireTime;
    }

    @Basic
    @Column(name = "is_exprie")
    public int getIsExprie() {
        return isExprie;
    }

    public void setIsExprie(int isExprie) {
        this.isExprie = isExprie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LgmnSmsCodeEntity that = (LgmnSmsCodeEntity) o;
        return id == that.id &&
                isExprie == that.isExprie &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(code, that.code) &&
                Objects.equals(sendTime, that.sendTime) &&
                Objects.equals(expireTime, that.expireTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phone, code, sendTime, expireTime, isExprie);
    }
}

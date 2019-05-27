package com.lgmn.basicservices.api.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "lgmn_complaints", schema = "lgmn_basic_services", catalog = "")
public class LgmnComplaintsEntity {
    private int id;
    private String context;
    private String uid;
    private Integer status;
    private String result;
    private String handler;
    private Timestamp createTime;
    private Timestamp handleTime;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "context", nullable = false, length = 500)
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Basic
    @Column(name = "uid", nullable = true, length = 32)
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "result", nullable = true, length = 200)
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Basic
    @Column(name = "handler", nullable = true, length = 32)
    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "handle_time", nullable = true)
    public Timestamp getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Timestamp handleTime) {
        this.handleTime = handleTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LgmnComplaintsEntity that = (LgmnComplaintsEntity) o;
        return id == that.id &&
                Objects.equals(context, that.context) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(status, that.status) &&
                Objects.equals(result, that.result) &&
                Objects.equals(handler, that.handler) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(handleTime, that.handleTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, context, uid, status, result, handler, createTime, handleTime);
    }
}
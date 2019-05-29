package com.lgmn.basicservices.basic.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "lgmn_peccancy_query", schema = "lgmn_basic_services", catalog = "")
public class LgmnPeccancyQueryEntity {
    private int id;
    private String uid;
    private Timestamp queryDate;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "uid", nullable = false, length = 32)
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "query_date", nullable = false)
    public Timestamp getQueryDate() {
        return queryDate;
    }

    public void setQueryDate(Timestamp queryDate) {
        this.queryDate = queryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LgmnPeccancyQueryEntity that = (LgmnPeccancyQueryEntity) o;
        return id == that.id &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(queryDate, that.queryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uid, queryDate);
    }
}
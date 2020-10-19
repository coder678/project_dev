package com.school.project_dev.pojo;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "user_hib")
public class UserHib {
    @Id
    private Integer id;

    private Integer uid;

    private Integer hid;

    private Date htime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * @return hid
     */
    public Integer getHid() {
        return hid;
    }

    /**
     * @param hid
     */
    public void setHid(Integer hid) {
        this.hid = hid;
    }

    /**
     * @return htime
     */
    public Date getHtime() {
        return htime;
    }

    /**
     * @param htime
     */
    public void setHtime(Date htime) {
        this.htime = htime;
    }
}
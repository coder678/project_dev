package com.school.project_dev.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user_ans")
public class UserAns {
    @Id
    private Integer id;

    private Integer uid;

    private Integer aid;

    public UserAns(Integer id, Integer uid, Integer aid) {
        this.id = id;
        this.uid = uid;
        this.aid = aid;
    }

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
     * @return aid
     */
    public Integer getAid() {
        return aid;
    }

    /**
     * @param aid
     */
    public void setAid(Integer aid) {
        this.aid = aid;
    }
}
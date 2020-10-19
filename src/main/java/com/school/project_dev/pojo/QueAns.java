package com.school.project_dev.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "que_ans")
public class QueAns {
    @Id
    private Integer id;

    private Integer queid;

    private Integer aid;

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
     * @return queid
     */
    public Integer getQueid() {
        return queid;
    }

    /**
     * @param queid
     */
    public void setQueid(Integer queid) {
        this.queid = queid;
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
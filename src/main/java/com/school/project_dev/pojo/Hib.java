package com.school.project_dev.pojo;

import javax.persistence.Id;

public class Hib {
    @Id
    private Integer id;

    private String hname;

    private Integer hgrade;

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
     * @return hname
     */
    public String getHname() {
        return hname;
    }

    /**
     * @param hname
     */
    public void setHname(String hname) {
        this.hname = hname;
    }

    /**
     * @return hgrade
     */
    public Integer getHgrade() {
        return hgrade;
    }

    /**
     * @param hgrade
     */
    public void setHgrade(Integer hgrade) {
        this.hgrade = hgrade;
    }
}
package com.school.project_dev.pojo;

import javax.persistence.Id;

public class User {
    @Id
    private Integer id;

    private String name;

    private String pwd;

    private String heimgpath;

    private Integer praisenum;

    private Integer ugrade;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * @return heimgpath
     */
    public String getHeimgpath() {
        return heimgpath;
    }

    /**
     * @param heimgpath
     */
    public void setHeimgpath(String heimgpath) {
        this.heimgpath = heimgpath;
    }

    /**
     * @return praisenum
     */
    public Integer getPraisenum() {
        return praisenum;
    }

    /**
     * @param praisenum
     */
    public void setPraisenum(Integer praisenum) {
        this.praisenum = praisenum;
    }

    /**
     * @return ugrade
     */
    public Integer getUgrade() {
        return ugrade;
    }

    /**
     * @param ugrade
     */
    public void setUgrade(Integer ugrade) {
        this.ugrade = ugrade;
    }
}
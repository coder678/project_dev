package com.school.project_dev.pojo;

import javax.persistence.Id;

public class Que {
    @Id
    private Integer id;

    private String quedesc;

    private Integer qgrade;

    /**
     * 0表示未解决,1表示解决
     */
    private Integer qstate;

    private String imgpath;

    private String soundpath;

    private String vidiopath;

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
     * @return quedesc
     */
    public String getQuedesc() {
        return quedesc;
    }

    /**
     * @param quedesc
     */
    public void setQuedesc(String quedesc) {
        this.quedesc = quedesc;
    }

    /**
     * @return qgrade
     */
    public Integer getQgrade() {
        return qgrade;
    }

    /**
     * @param qgrade
     */
    public void setQgrade(Integer qgrade) {
        this.qgrade = qgrade;
    }

    /**
     * 获取0表示未解决,1表示解决
     *
     * @return qstate - 0表示未解决,1表示解决
     */
    public Integer getQstate() {
        return qstate;
    }

    /**
     * 设置0表示未解决,1表示解决
     *
     * @param qstate 0表示未解决,1表示解决
     */
    public void setQstate(Integer qstate) {
        this.qstate = qstate;
    }

    /**
     * @return imgpath
     */
    public String getImgpath() {
        return imgpath;
    }

    /**
     * @param imgpath
     */
    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    /**
     * @return soundpath
     */
    public String getSoundpath() {
        return soundpath;
    }

    /**
     * @param soundpath
     */
    public void setSoundpath(String soundpath) {
        this.soundpath = soundpath;
    }

    /**
     * @return vidiopath
     */
    public String getVidiopath() {
        return vidiopath;
    }

    /**
     * @param vidiopath
     */
    public void setVidiopath(String vidiopath) {
        this.vidiopath = vidiopath;
    }
}
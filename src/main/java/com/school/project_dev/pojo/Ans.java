package com.school.project_dev.pojo;

import javax.persistence.Id;

public class Ans {
    @Id
    private Integer id;

    private String ansdesc;

    private String imgpath;

    private String soundpath;

    private String vidiopath;

    private Integer praisenum;

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
     * @return ansdesc
     */
    public String getAnsdesc() {
        return ansdesc;
    }

    /**
     * @param ansdesc
     */
    public void setAnsdesc(String ansdesc) {
        this.ansdesc = ansdesc;
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
}
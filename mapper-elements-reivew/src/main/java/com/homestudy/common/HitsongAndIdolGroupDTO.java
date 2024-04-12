package com.homestudy.common;

import java.util.List;

public class HitsongAndIdolGroupDTO {

    private int hitCode;
    private int groupCode;
    private List<IdolGroupDTO> idolList;
    private String hitName;
    private String hitYear;
    private String albumName;
    private String titleYn;

    public HitsongAndIdolGroupDTO() {
    }

    public HitsongAndIdolGroupDTO(int hitCode, int groupCode, List<IdolGroupDTO> idolList, String hitName, String hitYear, String albumName, String titleYn) {
        this.hitCode = hitCode;
        this.groupCode = groupCode;
        this.idolList = idolList;
        this.hitName = hitName;
        this.hitYear = hitYear;
        this.albumName = albumName;
        this.titleYn = titleYn;
    }

    public int getHitCode() {
        return hitCode;
    }

    public void setHitCode(int hitCode) {
        this.hitCode = hitCode;
    }

    public int getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(int groupCode) {
        this.groupCode = groupCode;
    }

    public List<IdolGroupDTO> getIdolList() {
        return idolList;
    }

    public void setIdolList(List<IdolGroupDTO> idolList) {
        this.idolList = idolList;
    }

    public String getHitName() {
        return hitName;
    }

    public void setHitName(String hitName) {
        this.hitName = hitName;
    }

    public String getHitYear() {
        return hitYear;
    }

    public void setHitYear(String hitYear) {
        this.hitYear = hitYear;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getTitleYn() {
        return titleYn;
    }

    public void setTitleYn(String titleYn) {
        this.titleYn = titleYn;
    }

    @Override
    public String toString() {
        return "HitsongAndIdolGroupDTO{" +
                "hitCode=" + hitCode +
                ", groupCode=" + groupCode +
                ", idolList=" + idolList +
                ", hitName='" + hitName + '\'' +
                ", hitYear='" + hitYear + '\'' +
                ", albumName='" + albumName + '\'' +
                ", titleYn='" + titleYn + '\'' +
                '}';
    }
}

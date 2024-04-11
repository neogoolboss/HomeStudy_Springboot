package com.homestudy.common;

public class HitsongDTO {

    private int hitCode;        // 히트곡 코드
    private int groupCode;      // 그룹 코드
    private String hitName;     // 히트곡 명
    private String hitYear;     // 히트년도
    private String albumName;   // 앨범 명
    private char titleYn;       // 타이틀 여부

    public HitsongDTO() {
    }

    public HitsongDTO(int hitCode, int groupCode, String hitName, String hitYear, String albumName, char titleYn) {
        this.hitCode = hitCode;
        this.groupCode = groupCode;
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

    public char getTitleYn() {
        return titleYn;
    }

    public void setTitleYn(char titleYn) {
        this.titleYn = titleYn;
    }

    @Override
    public String toString() {
        return "HitsongDTO{" +
                "hitCode=" + hitCode +
                ", groupCode=" + groupCode +
                ", hitName='" + hitName + '\'' +
                ", hitYear='" + hitYear + '\'' +
                ", albumName='" + albumName + '\'' +
                ", titleYn=" + titleYn +
                '}';
    }

}

package com.homestudy.common;

public class IdolGroupDTO {

    private int groupCode;      // 그룹 코드
    private String groupName;   // 그룹 명
    private int groupCount;     // 그룹 인원
    private String entName;     // 소속사
    private String hitsong;     // 히트곡
    private String fandumName;  // 팬덤 명
    private String debYear;     // 데뷔년도
    private String disYear;     // 해체연도
    private char disYn;         // 해체여부

    public IdolGroupDTO() {
    }

    public IdolGroupDTO(int groupCode, String groupName, int groupCount, String entName, String hitsong, String fandumName, String debYear, String disYear, char disYn) {
        this.groupCode = groupCode;
        this.groupName = groupName;
        this.groupCount = groupCount;
        this.entName = entName;
        this.hitsong = hitsong;
        this.fandumName = fandumName;
        this.debYear = debYear;
        this.disYear = disYear;
        this.disYn = disYn;
    }

    public int getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(int groupCode) {
        this.groupCode = groupCode;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupCount() {
        return groupCount;
    }

    public void setGroupCount(int groupCount) {
        this.groupCount = groupCount;
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    public String getHitsong() {
        return hitsong;
    }

    public void setHitsong(String hitsong) {
        this.hitsong = hitsong;
    }

    public String getFandumName() {
        return fandumName;
    }

    public void setFandumName(String fandumName) {
        this.fandumName = fandumName;
    }

    public String getDebYear() {
        return debYear;
    }

    public void setDebYear(String debYear) {
        this.debYear = debYear;
    }

    public String getDisYear() {
        return disYear;
    }

    public void setDisYear(String disYear) {
        this.disYear = disYear;
    }

    public char getDisYn() {
        return disYn;
    }

    public void setDisYn(char disYn) {
        this.disYn = disYn;
    }

    @Override
    public String toString() {
        return "IdolGroupDTO{" +
                "groupCode=" + groupCode +
                ", groupName='" + groupName + '\'' +
                ", groupCount=" + groupCount +
                ", entName='" + entName + '\'' +
                ", hitsong='" + hitsong + '\'' +
                ", fandumName='" + fandumName + '\'' +
                ", debYear='" + debYear + '\'' +
                ", disYear='" + disYear + '\'' +
                ", disYn=" + disYn +
                '}';
    }

}

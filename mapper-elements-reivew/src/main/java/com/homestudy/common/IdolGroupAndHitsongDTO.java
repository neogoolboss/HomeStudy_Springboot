package com.homestudy.common;

public class IdolGroupAndHitsongDTO {

    private int groupCode;
    private String groupName;
    private int groupCount;
    private String entName;
    private HitsongDTO hitsong;
    private String fandumName;
    private String debYear;
    private String disYear;
    private String disYn;

    public IdolGroupAndHitsongDTO() {
    }

    public IdolGroupAndHitsongDTO(int groupCode, String groupName, int groupCount, String entName, HitsongDTO hitsong, String fandumName, String debYear, String disYear, String disYn) {
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

    public HitsongDTO getHitsong() {
        return hitsong;
    }

    public void setHitsong(HitsongDTO hitsong) {
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

    public String getDisYn() {
        return disYn;
    }

    public void setDisYn(String disYn) {
        this.disYn = disYn;
    }

    @Override
    public String toString() {
        return "IdolGroupAndHitsongDTO{" +
                "groupCode=" + groupCode +
                ", groupName='" + groupName + '\'' +
                ", groupCount=" + groupCount +
                ", entName='" + entName + '\'' +
                ", hitsong=" + hitsong +
                ", fandumName='" + fandumName + '\'' +
                ", debYear='" + debYear + '\'' +
                ", disYear='" + disYear + '\'' +
                ", disYn='" + disYn + '\'' +
                '}';
    }
}

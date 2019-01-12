package com.company.repin;

public class Student {
    private String name;
    private int iqLevel;
    private int luckLevel;
    private int charismaLevel;
    private int beautyLevel;
    boolean isMan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIqLevel() {
        return iqLevel;
    }

    public void setIqLevel(int iqLevel) {
        this.iqLevel = iqLevel;
    }

    public int getLuckLevel() {
        return luckLevel;
    }

    public void setLuckLevel(int luckLevel) {
        this.luckLevel = luckLevel;
    }

    public int getCharismaLevel() {
        return charismaLevel;
    }

    public void setCharismaLevel(int charismaLevel) {
        this.charismaLevel = charismaLevel;
    }

    public int getBeautyLevel() {
        return beautyLevel;
    }

    public void setBeautyLevel(int beautyLevel) {
        this.beautyLevel = beautyLevel;
    }

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }
}

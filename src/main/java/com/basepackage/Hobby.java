package com.basepackage;

public abstract class Hobby {
    private String hobbyName;
    private int yearsSpent;
    private boolean isActive;

    public abstract void tellAboutHobby();

    public Hobby(String hobbyName, int yearsSpent, boolean isActive) {
        this.hobbyName = hobbyName;
        this.yearsSpent = yearsSpent;
        this.isActive = isActive;
    }

    public Hobby() {
        this.hobbyName = "Unknown";
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    public int getYearsSpent() {
        return yearsSpent;
    }

    public void setYearsSpent(int yearsSpent) {
        this.yearsSpent = yearsSpent;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "hobbyName='" + hobbyName + '\'' +
                ", yearsSpent=" + yearsSpent +
                ", isActive=" + isActive +
                '}';
    }
}

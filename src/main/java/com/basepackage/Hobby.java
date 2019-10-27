package com.basepackage;

public abstract class Hobby {
    private String hobbyName;
    private int yearsSpent;
    private boolean isActive;

    public abstract void tellAboutHobby(String name) throws Exception;

    Hobby(final String userHobbyName,
          final int userYearsSpent, final boolean userIsActive) {
        this.hobbyName = userHobbyName;
        this.yearsSpent = userYearsSpent;
        this.isActive = userIsActive;
    }

    Hobby() {
        this.hobbyName = "Unknown";
    }

    final String getHobbyName() {
        return hobbyName;
    }

    final void setHobbyName(final String userHobbyName) {
        this.hobbyName = userHobbyName;
    }

    final int getYearsSpent() {
        return yearsSpent;
    }

    final void setYearsSpent(final int userYearsSpent) {
        this.yearsSpent = userYearsSpent;
    }

    final boolean isActive() {
        return isActive;
    }

    final void setIsActive(final boolean userIsActive) {
        this.isActive = userIsActive;
    }

    /**
     * Returns basic info on a hobby.
     * @return basic info
     */

    @Override
    public String toString() {
        return "Hobby{" + "hobbyName='" + hobbyName + '\''
                + ", yearsSpent=" + yearsSpent
                + ", isActive=" + isActive + '}';
    }

    abstract void setStyle(String style);
    abstract void setSeason(String season);
    abstract void setAverageTrophies(float avg);
}

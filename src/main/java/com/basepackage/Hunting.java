package com.basepackage;

public final class Hunting extends Hobby {
    private String season;
    private float averageTrophies;

    Hunting() { }

    public Hunting(final String hobbyName, final int yearsSpent,
                   final boolean isActive, final String userSeason,
                   final float userAverageTrophies) {
        super(hobbyName, yearsSpent, isActive);
        this.season = userSeason;
        this.averageTrophies = userAverageTrophies;
    }

    public String getSeason() {
        return season;
    }

    @Override
    public void setSeason(final String userSeason) {
        this.season = userSeason;
    }

    public float getAverageTrophies() {
        return averageTrophies;
    }

    @Override
    public void setAverageTrophies(final float userAverageTrophies) {
        this.averageTrophies = userAverageTrophies;
    }

    public void setStyle(final String style) { }

    @Override
    public void tellAboutHobby(final String name) throws Exception {
        try {
            System.out.println(this.toString(name));
        } catch (HobbyException hException) {
            System.out.println("Instead of your name I got an empty string.");
        } catch (Exception genException) {
            System.out.println("General Exception occurred"
                    + " trying to call tellAboutHobby() method");
        }
    }

    private String toString(final String name) throws HobbyException {
        if (name.equals("")) {
            throw new HobbyException();
        }
        return "Hey," + name + ", here's info on a Hunt{"
                + "hobbyName='" + this.getHobbyName() + '\''
                + ", yearsSpent=" + this.getYearsSpent()
                + ", isActive=" + this.isActive()
                + ", season=" + season
                + ", averageTrophies=" + averageTrophies + '}';
    }

    @Override
    public String toString() {
        System.out.println("You should call this method with a String argument."
                + " Pass your name as an argument and try again.");
        return "";
    }
}

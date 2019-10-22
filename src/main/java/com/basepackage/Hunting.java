package com.basepackage;

/**
 * Created by klass on 17.10.2019.
 */
public class Hunting extends Hobby {
    private String season;
    private float averageTrophies;

    public Hunting(String hobbyName, int yearsSpent, boolean isActive, String season, float averageTrophies) {
        super(hobbyName, yearsSpent, isActive);
        this.season = season;
        this.averageTrophies = averageTrophies;
    }

    @Override
    public void tellAboutHobby() {
        if(this.getHobbyName().equals("Unknown")){
            System.out.println("Given hobby was not defined.");
        }
        else {
            System.out.println(this.toString());
        }
    }

    @Override
    public String toString() {
        return "Hunting{" +
                "hobbyName='" + this.getHobbyName() + '\'' +
                ", yearsSpent=" + this.getYearsSpent() +
                ", isActive=" + this.isActive() +
                ", season=" + season +
                ", averageTrophies=" + averageTrophies +
                '}';
    }
}

package com.basepackage;

/**
 * Created by klass on 17.10.2019.
 */
public class Art extends Hobby {
    private String style;

    public Art(String hobbyName, int yearsSpent, boolean isActive, String style) {
        super(hobbyName, yearsSpent, isActive);
        this.style = style;
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
        return "Hobby{" +
                "hobbyName='" + this.getHobbyName() + '\'' +
                ", yearsSpent=" + this.getYearsSpent() +
                ", style=" + style +
                '}';
    }
}

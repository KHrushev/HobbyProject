package com.basepackage;

public final class Art extends Hobby {
    private String style;

    Art() { }

    public Art(final String hobbyName, final int yearsSpent,
               final boolean isActive, final String uStyle) {
        super(hobbyName, yearsSpent, isActive);
        this.style = uStyle;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(final String userStyle) {
        this.style = userStyle;
    }

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

    private String toString(final String name) throws Exception {
        if (name.equals("")) {
            throw new HobbyException();
        } else {
            return "Hey," + name + ", here's info on an Art{"
                    + "hobbyName='"
                    + this.getHobbyName()
                    + '\''
                    + ", yearsSpent="
                    + this.getYearsSpent()
                    + ", isActive="
                    + this.isActive()
                    + ", style="
                    + style
                    + '}';
        }
    }

    @Override
    public String toString() {
        System.out.println("You should call this method with a String argument."
                + " Pass your name as an argument and try again.");
        return "";
    }

    @Override
    void setAverageTrophies(final float avg) { }

    @Override
    void setSeason(final String season) { }
}

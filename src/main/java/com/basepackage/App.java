package com.basepackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.log4j.Logger;

public class App {

    final static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) throws Exception {
        logger.info("Logger started successfuly.");

        String name;
        String style;
        String season;
        int yearsSpent;
        float avg;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Art hobby1 = new Art();
        Art hobby2 = new Art();
        Hunting hobby3 = new Hunting();

        Hobby[] hobbies = {hobby1, hobby2, hobby3};

        try {
            for (Hobby hobby : hobbies) {
                if (hobby.getClass()
                        .getName().equals("com.basepackage.Art")) {
                    System.out.println("Enter name of your art-hobby: ");
                    name = reader.readLine();
                    System.out.println("Your style of art: ");
                    style = reader.readLine();
                    System.out.println("Years spent:");
                    yearsSpent = Integer.parseInt(reader.readLine());

                    hobby.setHobbyName(name);
                    hobby.setStyle(style);
                    hobby.setYearsSpent(yearsSpent);
                    hobby.setIsActive(false);
                } else {
                    System.out.println("Enter name of your hunting-hobby: ");
                    name = reader.readLine();
                    System.out.println("Preferred season of hunt: ");
                    season = reader.readLine();
                    System.out.println(
                            "Average trophies per hunt(float value): ");
                    avg = Float.parseFloat(reader.readLine());
                    System.out.println("Years spent:");
                    yearsSpent = Integer.parseInt(reader.readLine());

                    hobby.setHobbyName(name);
                    hobby.setSeason(season);
                    hobby.setAverageTrophies(avg);
                    hobby.setYearsSpent(yearsSpent);
                    hobby.setIsActive(true);
                }

                logger.info("Array of hobbies has been successfully initialized!");
            }
        } catch (IOException ioExc) {
            System.out.println(
                    "Input/Output Exception Occurred"
                    + " while reading input for hobbies");
            logger.error("Input/Output Exception occurred");
            System.exit(-1);
        } catch (RuntimeException runExc) {
            System.out.println("Runtime exception detected"
                    + " while reading input for hobbies");
            logger.error("RuntimeException occurred Exception occurred");
            System.exit(-1);
        }

        System.out.println("Your name: ");
        name = reader.readLine();

        for (Hobby i: hobbies) {
            i.tellAboutHobby(name);
        }
    }
}

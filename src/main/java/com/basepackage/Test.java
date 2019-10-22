package com.basepackage;

public class Test {
    public static void main( String[] args ) {

        Hobby hobby1 = new Art("Painting", 5, false, "oil");
        Hobby hobby2 = new Art("Painting", 2, false, "pastel");
        Hobby hobby3 = new Hunting("Hunt", 3, true, "autumn-winter", (float)2.5);
        Hobby hobby4 = new Hunting("Hunt", 7, true, "spring-summer", (float)4.5);

        Hobby[] hobbies = {hobby1, hobby2, hobby3, hobby4};

        for (Hobby i: hobbies){
            i.tellAboutHobby();
        }

        /*
        Human student1 = new Student("Hiro", 19, 1000);
        Human student2 = new Student("ZeroTsu", 18, 1300);
        Human teacher1 = new Teacher("Anna", 29, 6000);

        Human[] humans = {student1, student2, teacher1};

        for (Human i: humans) {
            i.earnMoney();
        }
        */
    }
}

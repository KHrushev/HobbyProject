package com.basepackage.humans;

/**
 * Created by klass on 17.10.2019.
 */
public class Student extends Human {
    private float scholarship;

    public Student(String name, int age, float scholarship) {
        super(name, age);
        this.scholarship = scholarship;
    }

    @Override
    public void earnMoney() {
        System.out.println("Earns scholarship: " + scholarship);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + this.getName() +
                ", age=" + this.getAge() +
                ", scholarship=" + scholarship +
                '}';
    }
}

package com.basepackage.humans;

/**
 * Created by klass on 17.10.2019.
 */
public abstract class Human {
    private String name;
    private int age;

    abstract public void earnMoney();

    public Human() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

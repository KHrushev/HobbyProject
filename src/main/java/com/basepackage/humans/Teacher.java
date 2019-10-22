package com.basepackage.humans;

/**
 * Created by klass on 17.10.2019.
 */
public class Teacher extends Human {
    private int salary;

    public Teacher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void earnMoney() {
        System.out.println("Earns salary: " + salary);
    }
}

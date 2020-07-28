package com.kodilla.abstracts.Homework;

public class Programmer extends Job{
    public Programmer(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void getSalary() {

    }

    @Override
    public String getResponsibilities() {

        return null;
    }

    public Job programmer = new Programmer(999999999, "Even he doesn't know");
}

package com.kodilla.abstracts.Homework;

public class Cheff extends Job {
    public Cheff(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void getSalary() {

    }

    @Override
    public String getResponsibilities() {

        return null;
    }

    public Job cheff = new Cheff(6000,"Makes food");
}

package com.kodilla.abstracts.Homework;

public class Doctor extends Job{
    public Doctor(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void getSalary() {

    }

    @Override
    public String getResponsibilities() {

        return null;
    }

    private Job doctor = new Doctor(10000,"Healing people");
}

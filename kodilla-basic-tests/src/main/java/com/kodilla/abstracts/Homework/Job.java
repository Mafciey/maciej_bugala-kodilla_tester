package com.kodilla.abstracts.Homework;

public abstract class Job {
    private int salary = 0;
    private String responsibilities;

    public Job(int salary, String responsibilities){
        this.salary= salary;
        this.responsibilities = responsibilities;
    }
    public abstract void getSalary();
    public abstract String getResponsibilities();
}

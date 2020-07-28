package com.kodilla.abstracts.Homework;

public class PersonApp {

    public static void main(String[] args) {
        Person jacek = new Person(20, "Jacek",new Cheff(10000,"Cooking"));
        Person heniu = new Person(12, "Heniu", new Programmer(9999999,"Even he doesn't know"));
        Person julia = new Person(50, "Julia", new Doctor(30000, "Healing people"));
        String jacekOdp = jacek.job.getResponsibilities();
        String heniuOdp = heniu.job.getResponsibilities();
        String juliaOdp = julia.job.getResponsibilities();
        System.out.println(jacekOdp);
        System.out.println(heniuOdp);
        System.out.println(juliaOdp);
    }
}

package com.kodilla.inheritance.Homework;

public class OperatingSystem {
    private int rokWydania;

    public OperatingSystem(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public void turnOn() {
        System.out.println("Włączanie systemu");
    }

    public void turnOf() {
        System.out.println("Wyłączanie systemu");
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void showYear() {
        System.out.println("Rok wydania systemu to:" + rokWydania);
    }

}

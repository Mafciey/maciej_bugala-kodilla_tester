package com.kodilla.inheritance.Homework;

public class Windows extends OperatingSystem {

    public Windows(int rokWydania) {
        super(rokWydania);
    }

    @Override
    public void turnOn() {
        System.out.println("Włączanie systemu Windows");
    }

    @Override
    public void turnOf() {
        System.out.println("Wyłączanie systemu Windows");
    }
}

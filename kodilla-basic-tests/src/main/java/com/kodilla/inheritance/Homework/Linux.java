package com.kodilla.inheritance.Homework;

public class Linux extends OperatingSystem{

    public Linux(int rokWydania) {
        super(rokWydania);
    }

    @Override
    public void turnOn() {
        System.out.println("Włączanie systemu Linux");
    }

    @Override
    public void turnOf() {
        System.out.println("Wyłączanie systemu Linux");
    }

}

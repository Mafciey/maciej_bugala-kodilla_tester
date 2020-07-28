package com.kodilla.abstracts.Homework;

public class Rectangle extends Shape{
    public Rectangle(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public int getPole() {
    int pole = getA() * getB();
        System.out.println("Pole tego prostokąta wynosi: " + pole);
        return pole;
    }

    @Override
    public int getObwod() {
        int obwod = 2 * getA() + 2 * getB();
        System.out.println("Obwód tego prostokąta wynosi: " + obwod);
        return obwod;
    }
}

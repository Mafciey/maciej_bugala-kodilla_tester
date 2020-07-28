package com.kodilla.abstracts.Homework;

public class Square extends Shape {
    public Square(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public int getPole() {
    int pole = getA() * getC();
        System.out.println("Pole wynosi: " + pole);
        return pole;
    }

    @Override
    public int getObwod() {
    int obwod = getA() * getA();
        System.out.println("Obwód wynosi: " + obwod);
        return obwod;
    }
}

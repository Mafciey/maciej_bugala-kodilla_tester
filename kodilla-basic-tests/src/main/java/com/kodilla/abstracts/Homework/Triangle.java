package com.kodilla.abstracts.Homework;

public class Triangle extends Shape {
    public Triangle(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public int getPole() {
        int suma = getA() * getC();
        int pole = suma / 2;
        System.out.println("Pole tego trójkąta wynosi: " + pole);
        return suma;
    }

    @Override
    public int getObwod() {
        int obwod = getA() + getB() + getC();
        System.out.println("Obwod tego trójkąta wynosi: " + obwod);
        return obwod;
    }
}

package com.kodilla.abstracts.Homework;

public class Application {
    public static void main(String[] args) {
        Shape square = new Square(25, 0, 10);
        int poleKwadratu = square.getPole();
        int obwodKwadratu = square.getObwod();
        System.out.println(poleKwadratu);
        System.out.println(obwodKwadratu);

        Shape triangle = new Triangle(6, 8, 10);
        int poleTrojkata = triangle.getPole();
        int obwodTrojkata = triangle.getObwod();
        System.out.println(poleTrojkata);
        System.out.println(obwodTrojkata);

        Shape rectangle = new Rectangle(10,10,10);
        int obwodProstokata = rectangle.getObwod();
        int poleProstokata = rectangle.getPole();
        System.out.println(obwodProstokata);
        System.out.println(poleProstokata);

    }
}

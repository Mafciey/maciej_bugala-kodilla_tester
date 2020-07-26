package com.kodilla.inheritance.Homework;

public class Aplication {
    public static void main(String[] args) {
        Linux linux = new Linux(1410);
        Windows windows = new Windows(2021);
        linux.turnOf();
        linux.turnOn();
        System.out.println(linux.getRokWydania());
        System.out.println(windows.getRokWydania());

//        Gra wiedzmin = new Gra("Wiedzmin","CD project Red", 12312);
//        wiedzmin.gameParameters();
    }
}

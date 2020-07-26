package com.kodilla.inheritance.Homework;

public class Gra {
    private String name;
    private String publisher;
    private int code;

    public Gra(String name, String publisher, int code){
        this.name = name;
        this.publisher = publisher;
        this.code = code;
    }

    public void gameParameters(){
        System.out.println("Name: " + name + " " + "Publisher: " + publisher + " " + "Game code: " + code);
    }
}

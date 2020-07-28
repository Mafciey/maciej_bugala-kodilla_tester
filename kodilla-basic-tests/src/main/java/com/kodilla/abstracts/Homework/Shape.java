package com.kodilla.abstracts.Homework;

public abstract class Shape {

    private int a = 0;
    private int b =0;
    private int c=0;

    public Shape(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }
    public abstract int getPole();

    public abstract int getObwod();
}

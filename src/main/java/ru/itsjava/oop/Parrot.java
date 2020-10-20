package ru.itsjava.oop;

public class Parrot extends Bird{
    public Parrot() {
        super("Parrot", true);
    }

    public void saySound(){
        System.out.println("tweet tweet tweet tweeet");
    }

}

package ru.itsjava.interfaces;

public class Dog implements Runnable, Walkable,Swimable{
    @Override
    public void run() {
        System.out.println("Собака быстро бежит!");
    }

    @Override
    public int maxRunDistance() {
        return 999;
    }

    @Override
    public void swim() {
        System.out.println("Собака плывёт!");
    }

    @Override
    public double maxSwimSpeed() { ;
        return 0.038;
    }

    @Override
    public void walk() {
        System.out.println("Собака идёт!");
    }

}

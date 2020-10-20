package ru.itsjava.interfaces;

public class Cat implements Runnable, Walkable{
    @Override
    public void run(){
        System.out.println("Кот бежит быстро!");
    }

    @Override
    public int maxRunDistance() {
        return 999;
    }

    @Override
    public void walk() {
        System.out.println("Кот идёт!");
    }
}

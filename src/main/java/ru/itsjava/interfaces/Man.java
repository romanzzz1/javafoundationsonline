package ru.itsjava.interfaces;

public class Man implements Runnable, Walkable,Swimable,Flyable{
    @Override
    public void fly() {
        System.out.println("Человек летит, но на самолёте или вертолёте (а возможно на парашюте или в свободном падении!)");
    }

    @Override
    public String flyMaxDistance() {
        return "Много, но на самолёте и т.д....";
    }

    @Override
    public void run() {
        System.out.println("Человек быстро бежит (а если человек полный, то медленно)");
    }

    @Override
    public int maxRunDistance() {
        return 999;
    }

    @Override
    public void swim() {
        System.out.println("Человек быстро плывёт (а если человек полный или плохо плавает, то медленно)");
    }

    @Override
    public double maxSwimSpeed() {
        return 9;
    }

    @Override
    public void walk() {
        System.out.println("Человек идёт!");
    }
}

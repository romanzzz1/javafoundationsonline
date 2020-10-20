package ru.itsjava.interfaces;
public class Bird implements Flyable,Walkable{
    @Override
    public void fly(){
        System.out.println("Птица летит!");
    }

    @Override
    public String flyMaxDistance() {
        return "Много...";
    }

    @Override
    public void walk() {
        System.out.println("Птица идёт, но медленно!");
    }
}

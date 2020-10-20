package ru.itsjava.interfaces;

public class Fish implements Swimable{
    @Override
public void swim(){
        System.out.println("Рыба плывет!");
    }

    @Override
    public double maxSwimSpeed(){
       return 112;
    }
}

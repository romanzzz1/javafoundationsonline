package ru.itsjava.interfaces2;

public class Cow implements Talkable, Eatable {
    @Override
    public void talk(){
        System.out.println("Mooooooo! Moo! Moo! Mooooo!");
    }
    @Override
    public void eat(){
        System.out.println("Я корова и я кушаю траву! Yum-yum-yum.");
    }
}

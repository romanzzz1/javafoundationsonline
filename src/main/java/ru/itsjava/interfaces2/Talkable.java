package ru.itsjava.interfaces2;

public interface Talkable {
    default void talk(){
        System.out.println("Я разговариваю!");
    }
}

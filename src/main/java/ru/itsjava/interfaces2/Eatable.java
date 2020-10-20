package ru.itsjava.interfaces2;

public interface Eatable {
    default void eat(){
        System.out.println("Я кушаю!");
    }
}

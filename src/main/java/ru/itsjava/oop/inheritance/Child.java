package ru.itsjava.oop.inheritance;

public class Child implements Mother,Father {
    @Override
    public void giveLove() {
        System.out.println("Child give love!");
    }
}

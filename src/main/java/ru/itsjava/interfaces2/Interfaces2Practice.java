package ru.itsjava.interfaces2;

public class Interfaces2Practice {
    public static void main(String[] args) {
        Cow cow1 = new Cow();
        Man man1 = new Man();
        Plant plant1 = new Plant();

        cow1.eat();
        cow1.talk();
        System.out.println(" ");
        man1.eat();
        man1.talk();
        System.out.println(" ");
        plant1.eat();
        plant1.talk();

    }
}

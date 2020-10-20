package ru.itsjava.interfaces;

public class InterfacesPractice {
    public static void main(String[] args) {
Creatable khotabic = new Gin();
Creatable badGin = new BadGin();
khotabic.createWish();
badGin.createWish();

Fish fish = new Fish();
fish.maxSwimSpeed();
fish.swim();

khotabic.canYouCreateWish();
badGin.canYouCreateWish();

    }
}

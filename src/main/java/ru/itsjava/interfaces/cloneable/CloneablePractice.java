package ru.itsjava.interfaces.cloneable;

import java.util.Arrays;

public class CloneablePractice {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person tatiana = new Person("Tatiana", "Tarasova", 31);
        Person travis = new Person("Travis", "Karambaev", 19);
        Person nicola = new Person("Nicola", "Ivanov", 31);
        Person santiago = new Person("Santiago", "Barboza", 19);

        System.out.println("kalina.compareTo() = " + tatiana.compareTo(travis));

        Person[] persons = {tatiana, travis, nicola, santiago};
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));

        Person travis2 = (Person) travis.clone();
    }
}

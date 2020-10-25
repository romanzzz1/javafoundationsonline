package ru.itsjava.testPractice;

public class PersonMain {
    public static void main(String[] args) {
        Person man = new Person("Karim", 18);
        System.out.println("Имя человека я= " + man.getName());
        System.out.println("Возраст " + man.getName() + " = " + man.getAge());
        System.out.println("man.takeBeer() = " + man.takeBeer());
        man.birthday();
        System.out.println("Возраст " + man.getName() + " = " + man.getAge());
        System.out.println("man.takeBeer() = " + man.takeBeer());
    }
}

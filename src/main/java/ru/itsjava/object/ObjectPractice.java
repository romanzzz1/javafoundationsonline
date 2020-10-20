package ru.itsjava.object;

public class ObjectPractice {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1==obj2);
        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));
        obj2 = obj1;
        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));

        Dog gurka = new Dog("Журка", 4);
        Dog gurka2 = new Dog("Журка", 4);
        Dog murka = new Dog("Мурка", 4);

        System.out.println("gurka.equals(gurka2) = " + gurka.equals(gurka2));
        System.out.println("gurka.equals(murka) = " + gurka.equals(murka));

        System.out.println("gurka.toString() = " + gurka.toString());
        System.out.println("gurka.getNickname() = " + gurka.getNickname());
        System.out.println("gurka2.getNickname() = " + gurka2.getNickname());
    }
}

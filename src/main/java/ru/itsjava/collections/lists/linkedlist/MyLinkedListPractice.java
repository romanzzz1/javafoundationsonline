package ru.itsjava.collections.lists.linkedlist;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add("Строка1");
        System.out.println(list);
        list.add("Строка2");
        System.out.println(list);
        list.add("Строка3");
        System.out.println(list);
        list.add("Строка4");
        System.out.println(list.contains("Строка2"));
        System.out.println(list.contains("Строка10"));
        System.out.println(list.contains("Строка3"));
        System.out.println(list.contains("Строка1"));
        System.out.println(list.contains("Строка5"));
        System.out.println(list.contains("Строка4"));


    }
}

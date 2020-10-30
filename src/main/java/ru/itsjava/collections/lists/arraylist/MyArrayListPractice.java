package ru.itsjava.collections.lists.arraylist;

public class MyArrayListPractice {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println("list.size() = " + list.size());
        list.add("Привет");
        list.add("Пока");
        System.out.println("После добавления 2-х элементов размер списка = " + list.size());
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.toString() = " + list.toString());
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.contains(\"Пока\") = " + list.contains("Пока"));
        System.out.println("list.contains(\"Привет\") = " + list.contains("Привет"));
        System.out.println("list.contains(\"Um\") = " + list.contains("Um"));
        list.clear();
        System.out.println(list.toString());
    }
}

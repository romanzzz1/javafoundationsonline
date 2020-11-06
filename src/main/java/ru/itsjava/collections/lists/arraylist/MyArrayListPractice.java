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
        list.add("Привет");
        list.add("Пока");

        System.out.println(list.size());
        System.out.println(list);
        list.remove("Привет");
        System.out.println(list);
        System.out.println(list.size());
        list.remove("Пока");
        System.out.println(list);

        list.add("До_свидания");
        System.out.println(list);
        System.out.println(list.indexOf("Привет"));
        System.out.println(list);
    }
}

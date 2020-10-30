package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPracticeHW {
    public static void main(String[] args) {



        //0
        //а
        List<Book> booksEmptyList = new ArrayList<>();

        //б
        List<Book> booksList = new ArrayList<>(20);
        Book bookFirst = new Book("Тестовая книга!", "Роман", 100);
        booksList.add(bookFirst);


        //1
        //а
        System.out.println("Первый элемент списка booksList = " + booksList.get(0));

        // б
        System.out.println("Последний элемент списка booksList = " + booksList.get(booksList.size() - 1));

        //2
        //a
        Book book1 = new Book("7 навыков высокоэффективных людей", "Кови", 387);
        booksList.add(book1);
        Book book2 = new Book("Java. Эффективное программирование", "Блох Дж.", 219);
        booksList.add(book2);
        Book book3 = new Book("Приключения Тома Сойера", "Марк Твен", 202);
        booksList.add(book3);
        Book book4 = new Book("Метро 2033", "Дмитрий Глуховский", 381);
        booksList.add(book4);
        Book book5 = new Book("Подсознание может всё!", "Джон Кехо", 160);
        booksList.add(book5);

        //б
        Book book6 = new Book("Человек-амфибия", "Александр Беляев", 190);
        booksList.add(2, book6);
        Book book7 = new Book("Преступление и наказание", "Федор Достоевский", 331);
        booksList.add(0, book7);

        //в
        List<Book> newBooksList = new ArrayList<>();
        newBooksList.addAll(booksList);
        System.out.println("Новый список книг: " + newBooksList);

        //3
        //a
        newBooksList.remove(bookFirst);

        //б
        newBooksList.remove(3);

        //4
        System.out.println("Содержит ли список книг книгу " + newBooksList.get(newBooksList.indexOf(book5)).getTitle() + " - " + newBooksList.contains(book5));

        //5
        System.out.println("Список книг: " + newBooksList);
    }
}

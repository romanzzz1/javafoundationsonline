package ru.itsjava.collections.lists.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
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
        System.out.println(" 1 ");
        //а
        System.out.println(" а ");
        System.out.println("Первый элемент списка booksList = " + booksList.get(0));

        // б
        System.out.println(" б ");
        System.out.println("Последний элемент списка booksList = " + booksList.get(booksList.size() - 1));

        //2
        System.out.println(" 2 ");
        //a
        System.out.println(" а ");
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
        System.out.println("booksList = " + booksList);

        //б
        System.out.println(" б ");
        Book book6 = new Book("Человек-амфибия", "Александр Беляев", 190);
        booksList.add(2, book6);
        Book book7 = new Book("Преступление и наказание", "Федор Достоевский", 331);
        booksList.add(0, book7);
        System.out.println("booksList = " + booksList);

        //в
        System.out.println(" в ");
        List<Book> newBooksList = new ArrayList<>();
        newBooksList.addAll(booksList);
        System.out.println("Новый список книг: " + newBooksList);

        //3
        System.out.println(" 3 ");
        //a
        System.out.println(" а ");
        newBooksList.remove(bookFirst);
        System.out.println("newBooksList = " + newBooksList);

        //б
        System.out.println(" б ");
        newBooksList.remove(3);
        System.out.println("newBooksList = " + newBooksList);

        //4
        System.out.println(" 4 ");
        System.out.println("Содержит ли список книг книгу " + newBooksList.get(newBooksList.indexOf(book5)).getTitle() + " - " + newBooksList.contains(book5));

        //5
        System.out.println(" 5 ");
        System.out.println("Список книг: " + newBooksList);

        //6
        System.out.println(" 6 ");
        //a
        System.out.println(" а ");
        for (int i = 0; i < newBooksList.size(); i++) {
            if (i % 3 == 0) {
                System.out.println(newBooksList.get(i));
            }
        }

        //б
        System.out.println(" б ");
        int countJava = 0;
        for (int i = 0; i < newBooksList.size(); i++) {
            if (newBooksList.get(i).getTitle().equals("Java")) {
                countJava++;
            }
        }
        System.out.println("Кол-во книг с названием java = " + countJava);

        //7
        System.out.println(" 7 ");
        for (int i = 3; i < newBooksList.size(); i++) {
            System.out.println(newBooksList.get(i));
        }

        //8
        System.out.println(" 8 ");
        for (int i = 0; i < newBooksList.size() ; i++) {
            if (newBooksList.get(i).getAuthor().length()%3==0) {
                System.out.println(newBooksList.get(i));
                break;
            }
        }

        //9
        System.out.println(" 9 ");
        for (int i = 0; i < newBooksList.size() ; i++) {
            if (newBooksList.get(i).getAuthor().length()%3==0) {
                System.out.println(newBooksList.get(i));
            }
        }

        //10
        System.out.println(" 10 ");

        Person nicola = new Person("Nicola", 25, "Man");
        Person dmitry = new Person("Dmitry", 19, "Man");
        Person maria = new Person("Maria", 25, "Woman");
        Person taras = new Person("Taras", 41, "Man");
        Person maksim = new Person("Maksim", 29, "Man");
        Person viktoria = new Person("Viktoria", 18, "Woman");
        Person nikita = new Person("Nikita", 33, "Man");


        List<Person> persons = new ArrayList<>(Arrays.asList(nicola,dmitry,viktoria,taras,maksim,maria,nikita));
        System.out.println("Люди : " + persons);
        for (int i = 0; i < persons.size(); i++) {
            if ((persons.get(i).getIsMale().equals("Man")) && ( persons.get(i).getAge() > 18 && persons.get(i).getAge() < 27) && (persons.get(i).getName().charAt(0)=='N')) {
                System.out.println(persons.get(i) + " - этот мужчина годен для службы в армии!");
            }

        }

        //11
        System.out.println(" 11 ");
        int amountOfWomansAges = 0;
        int countOfWomans = 0;
        double averageAgeOfWomans;
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getIsMale().equals("Woman")) {
                amountOfWomansAges = amountOfWomansAges + persons.get(i).getAge();
                countOfWomans++;
            }
        }
        averageAgeOfWomans = amountOfWomansAges / countOfWomans;
        System.out.println(averageAgeOfWomans);
    }
}

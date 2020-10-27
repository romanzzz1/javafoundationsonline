package ru.itsjava.exceptions;

import ru.itsjava.interfaces.Car;

import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {
//       throw new RuntimeException("My runtime exception");
//        try {
//            System.out.println("BEGIN");
//            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("!!!");
//           e.printStackTrace();
//        } finally {
//            System.out.println("FINALLY");
//        }
//
//        Calculator calculator = new Calculator();
//
//        System.out.println("calculator.division(5,3) = " + calculator.division(5, 3));
//
//
//        try {
//            System.out.println("calculator.division(5,0) = " + calculator.division(5, 0));
//        } catch (CalculatorException ce) {
//            System.out.println("Вы ввели что-то не то!");
//ce.printStackTrace();
//        }
//
//        calculator.division(6,0);

        Scanner scanAge = new Scanner(System.in);
        int tempAge;
        Person person = new Person();
        System.out.println("Введите возраст человека!");
        tempAge = scanAge.nextInt();
        try {
            System.out.println(" Возраст человека = " + person.checkAge(tempAge));
        } catch (AgeNotValidException ae) {
            System.out.println("Вы ввели некорректный возраст!");
        }
    }
}

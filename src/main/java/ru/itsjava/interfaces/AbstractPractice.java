package ru.itsjava.interfaces;

public class AbstractPractice {
    public static void main(String[] args) {
        Car bmw = new Bmw();
        bmw.getCarMake();
        bmw.seatInTheCar();

        Figure triangle = new Triangle();
        triangle.howCorners();
        triangle.whatType();
    }
}

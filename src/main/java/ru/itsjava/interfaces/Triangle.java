package ru.itsjava.interfaces;

public class Triangle extends Figure{

    public Triangle() {
        super("Triangle");
    }

    @Override
    void howCorners() {
        System.out.println("Треугольник имеет 3 угла!");
    }

    @Override
    void whatType() {
        System.out.println("Я - треугольник!");
    }
}

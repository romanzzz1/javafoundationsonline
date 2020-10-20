package ru.itsjava.interfaces;

public abstract class Figure {
    private final String type;
    abstract void howCorners();
    abstract void whatType();

    public Figure(String type) {
        this.type = type;
    }
}

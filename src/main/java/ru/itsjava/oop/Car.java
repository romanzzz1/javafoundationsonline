package ru.itsjava.oop;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor

public class Car {
    private final String brand;
    private String color;
    private static int cost = 3000000;


    public String toString() {
        return "Car(brand=" + this.brand + ", color=" + this.color + ")";
    }
}

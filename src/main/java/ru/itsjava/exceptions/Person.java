package ru.itsjava.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor

public class Person {
    private String name;
    private int age;

    public int checkAge(int age) throws AgeNotValidException {
        if (age <= 0 || age >= 150) {
            throw new AgeNotValidException("Некорректный возраст!");
        }
        return age;
    }
    }

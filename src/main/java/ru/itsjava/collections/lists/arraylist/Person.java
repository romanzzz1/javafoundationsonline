package ru.itsjava.collections.lists.arraylist;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Person {
    private String name;
    private int age;
    private final String isMale;
}

package ru.itsjava.collections.lists;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@Data

public class Person {
    private String name;
    private int age;
    private final String isMale;
}

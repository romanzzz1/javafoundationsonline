package ru.itsjava.interfaces.cloneable;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Person implements Comparable<Person>, Cloneable{
    private final String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private final String surname;
    private int age;

    @Override
    public int compareTo(Person person) {
        if (surname.equals(person.surname)){
            return 1;
        } else if (!surname.equals(person.surname)) {
            if (name.equals(person.name)) {
                return 1;
            } else if (!name.equals(person.name)) {
                if (age == person.age) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
        return 0;
    }
}


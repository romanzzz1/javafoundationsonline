package ru.itsjava.testPractice;

import lombok.*;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter


public class Person {
    public final String name;
    public int age;

    public void birthday() {
        this.age = this.age + 1;
    }

    public boolean takeBeer() {
        if (this.age > 18) {
            return true;
        } else return false;
    }
}

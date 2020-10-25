package ru.itsjava.testPractice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс Person должен: ")
public class PersonTest {
    public static final String DEFAULT_NAME = "Ivan";
    public static final int DEFAULT_AGE = 17;
    public static final int NEW_AGE = 21;

    @DisplayName("Корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor() {
        Person person = new Person(DEFAULT_NAME, DEFAULT_AGE);
        assertAll("person",
                () -> assertEquals(DEFAULT_NAME, person.getName()),
                () ->assertEquals(DEFAULT_AGE, person.getAge()));

    }
    @DisplayName(" корректно изменять возраст")
    @Test
    public void shouldHaveCorrectUpdateAge(){
        Person person = new Person(DEFAULT_NAME, DEFAULT_AGE);
        person.setAge(NEW_AGE);
        assertEquals(NEW_AGE, person.getAge());
    }

    @DisplayName(" корректно выполнять takeBeer ")
    @Test
    public void shouldHaveCorrectTakeBeer(){
        Person person = new Person(DEFAULT_NAME,DEFAULT_AGE);
        assertEquals(person.takeBeer(), false);
        person.setAge(NEW_AGE);
        assertEquals(person.takeBeer(), true);
    }
}
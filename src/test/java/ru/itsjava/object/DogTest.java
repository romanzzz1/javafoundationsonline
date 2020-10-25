package ru.itsjava.object;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс Dog должен: ")
public class DogTest {

    public static final String DEFAULT_NICKNAME = "Kalina";
    public static final int DEFAULT_PAWSCOUNT = 4;
    public static final int NEW_PAWSCOUNT = 2;

    @DisplayName("Корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor(){
        Dog dog = new Dog(DEFAULT_NICKNAME, DEFAULT_PAWSCOUNT);

//        assertEquals(DEFAULT_NICKNAME, dog.getNickname());
//        assertEquals(DEFAULT_PAWSCOUNT, dog.getPawsCount());

        assertAll("dog",
                () -> assertEquals(DEFAULT_NICKNAME, dog.getNickname()),
                () ->assertEquals(DEFAULT_PAWSCOUNT, dog.getPawsCount()));
    }
    @DisplayName(" корректно изменять кол-во лап")
@Test
    public void shouldHaveCorrectUpdateDog(){
        Dog dog = new Dog(DEFAULT_NICKNAME, DEFAULT_PAWSCOUNT);
        dog.setPawsCount(NEW_PAWSCOUNT);
        assertEquals(NEW_PAWSCOUNT, dog.getPawsCount());

    }
}

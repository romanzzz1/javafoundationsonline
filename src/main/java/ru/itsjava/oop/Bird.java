package ru.itsjava.oop;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Bird {
    private final String breed;
    private final boolean isFly;



    public void saySound(){
    }

    public String toString() {
        return "Вид птицы = " + this.breed + " , Летает (true) или не летает (false) = " + this.isFly + ")";
    }
}

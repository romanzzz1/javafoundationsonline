package ru.itsjava.interfaces.comparable;

import java.util.Arrays;

public class ComparablePractice {
    public static void main(String[] args) {
Boy roman = new Boy("Roman", 15, 175);
Boy vasya = new Boy("Vasya", 19, 160);
System.out.println("roman.compareTo(vasya) = " + roman.compareTo(vasya));
Boy vanya = new Boy("Vanya", 18, 190);
System.out.println("vasya.compareTo(vanya) = " + vasya.compareTo(vanya));

Boy[] boys = {roman,vasya,vanya};
System.out.println(Arrays.toString(boys));
Arrays.sort(boys);
System.out.println("Arrays.toString(boys) = " + Arrays.toString(boys));


    }
}

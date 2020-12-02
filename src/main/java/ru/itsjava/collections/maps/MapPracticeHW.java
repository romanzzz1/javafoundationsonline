package ru.itsjava.collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPracticeHW {
    public static void main(String[] args) {
        // 0
        Map<Man, Fruit> fruits = new HashMap<>();

        Man korolev = new Man("Королёв");
        Man tarasov = new Man("Тарасов");
        Man kalinin = new Man("Калинин");
        Fruit apple = new Fruit("Яблоко", 112);
        Fruit banana = new Fruit("Банан", 154);
        Fruit coconut = new Fruit("Кокос", 308);
        fruits.put(korolev, banana);
        fruits.put(tarasov, apple);
        fruits.put(kalinin, coconut);

        // 1
        System.out.println(fruits.get(tarasov));
        System.out.println(fruits.get(kalinin));
        System.out.println(fruits.get(korolev));

        // 2
        Map<Man, Fruit> fruits2 = new HashMap<>();
        fruits2.putAll(fruits);

        //3
        fruits.remove(kalinin);

        

        //5
        // а
        for (Map.Entry<Man, Fruit> pair : fruits.entrySet()) {
            System.out.println(pair.getKey());
        }
        // б
        for (Map.Entry<Man, Fruit> pair : fruits.entrySet()) {
            System.out.println(pair.getValue());
        }
        // в
        for (Map.Entry<Man, Fruit> pair : fruits.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

    }
}

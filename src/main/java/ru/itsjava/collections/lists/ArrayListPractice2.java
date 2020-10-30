package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        Watch romanSeiko = new Watch("Seiko", "Roman", 18_000.0);
        Watch viktorSeiko = new Watch("Seiko", "Viktor", 18_000.0);
        Watch dmitrySeiko = new Watch("Seiko", "Dmitry", 30_000.0);
        Watch valentinOmega = new Watch("Omega", "Valentin", 100_000.0);

        List<Watch> watches = new ArrayList<>(Arrays.asList(romanSeiko,valentinOmega,dmitrySeiko,viktorSeiko));
        System.out.println("Часы : " + watches);

        // вывести все часы, у которых фирма Seiko

        System.out.println("вывести все часы, у которых фирма Seiko");
        for (Watch watch: watches) {
            if (watch.getFirm().equals("Seiko")) {
                System.out.println(watch);
            }
        }

        // вывести все часы, у которых цена больше 30_000 рублей
        System.out.println("вывести все часы, у которых цена больше 25.000 рублей");
        for (Watch watch: watches){
            if (watch.getPrice()>=25000) {
                System.out.println(watch);
            }
        }

        // вывести одни часы, у которых цена больше 25_000 рублей
        System.out.println("вывести одни часы, у которых цена больше 25.000 рублей");
        for (Watch watch: watches){
            if (watch.getPrice()>=25000) {
                System.out.println(watch);
                break;
            }
        }

        // пропустить первые 2 элемента фирмы "Seiko"
        System.out.println("пропустить первые 2 элемента фирмы Seiko");
        int seikoCount = 0;
        for (int i = 0; i < watches.size(); i++){
            if (watches.get(i).getFirm().equals("Seiko") && seikoCount<2) {
                seikoCount++;
            } else {
                System.out.println(watches.get(i));
            }
        }
    }
}

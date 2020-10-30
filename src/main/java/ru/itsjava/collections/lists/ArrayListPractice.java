package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Watch> watchesList = new ArrayList<>();
        Watch seiko = new Watch("Seiko", "Roman", 18000.0);
        Watch gShock = new Watch("GSHOCK", "Best Dancer", 10000.0);

        watchesList.add(seiko);
        watchesList.add(gShock);
        System.out.println("List");

        for (Watch watchElement: watchesList) {
            System.out.println(watchElement);
        }

        System.out.println(" ");

        watchesList.remove(seiko);

        System.out.println("List");
        for (Watch watchElement: watchesList) {
            System.out.println(watchElement + " ");
        }
        System.out.println( );

        System.out.println("watchesList.contains(seiko) = " + watchesList.contains(seiko));
        System.out.println("watchesList.contains(gShock) = " + watchesList.contains(gShock));
        System.out.println("watchesList = " + watchesList);
        System.out.println("watchesList.get(0) = " + watchesList.get(0));
        System.out.println("watchesList.get(0).getFirm() = " + watchesList.get(0).getFirm());
        System.out.println("seiko.getFirm() = " + seiko.getFirm());
        watchesList.set(0, seiko);
        System.out.println("watchesList = " + watchesList);
        System.out.println("watchesList.size() = " + watchesList.size());

            List<Watch> watchesOmegaList = new ArrayList<>();

            Watch AndrewOmega = new Watch("Omega", "Andrew", 100_000.0);
            Watch RomanOmega = new Watch("Omega", "Roman", 100_000.0);

            watchesOmegaList.add(AndrewOmega);
            watchesOmegaList.add(RomanOmega);

        System.out.println("watchesOmegaList = " + watchesOmegaList);

        watchesList.addAll(watchesOmegaList);
        System.out.println("watchesList = " + watchesList);

        Watch vitaliyWatch = new Watch("Seiko", "Vitaliy", 20000.0);
        System.out.println("watchesList.get(2) = " + watchesList.get(2));
        watchesList.add(2, vitaliyWatch);
        System.out.println("watchesList.get(2) = " + watchesList.get(2));
        System.out.println("watchesList = " + watchesList);
        System.out.println("watchesList.get(3) = " + watchesList.get(3));
        watchesList.add(0, vitaliyWatch);
        System.out.println("watchesList = " + watchesList);
    }
}

package ru.itsjava.collections.maps;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor

public class Fruit {
    private final String name;
    private int weight;
}

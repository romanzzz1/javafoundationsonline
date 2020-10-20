package ru.itsjava.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor


public class Dog {
    private final String nickname;
    private int pawsCount;

}

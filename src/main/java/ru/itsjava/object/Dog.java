package ru.itsjava.object;

import lombok.*;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter


public class Dog {
    private final String nickname;
    private int pawsCount;

}

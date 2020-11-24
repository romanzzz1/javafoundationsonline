package ru.itsjava.collections.lists.linkedlists;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Node {
    private Object value;
    private Node next;
}

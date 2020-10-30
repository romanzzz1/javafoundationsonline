package ru.itsjava.collections.lists;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data

public class Book {
    private final String title;
    private final String author;
    private final int numberOfPages;

    public String toString() {
        return "Book (Название = " + this.getTitle() + " , Автор = " + this.getAuthor() + " , Кол-во страниц = " + this.getNumberOfPages() + ")";
    }
}

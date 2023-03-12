package eu.epfc.c5900.lesson3;

import java.time.LocalDate;
import java.util.List;

public class Book {
    private String isbn;
    private String title;
    private LocalDate editionDate;
    private int numberPages;
    private LiteraryWork literaryWork;
    private List<Editor> editors;
    private Language language;
    private Country country;
}

package main;

import libri.Libro;

public class Main {

    public static void main(String[] args) {
        Libro libro = new Libro("Il Signore degli Anelli", "1234567890", "J.R.R. Tolkien", 1954);
        libro.stampaInfo();
    }
}

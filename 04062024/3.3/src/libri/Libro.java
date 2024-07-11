package libri;

public class Libro {
    private String titolo;
    private String ISBN;
    private String autore;
    private int anno;

    public Libro() {
        // Costruttore di base
    }

    public Libro(String titolo, String ISBN, String autore, int anno) {
        this.titolo = titolo;
        this.ISBN = ISBN;
        this.autore = autore;
        this.anno = anno;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void stampaInfo() {
        System.out.println("Titolo: " + titolo);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Autore: " + autore);
        System.out.println("Anno: " + anno);
    }

}
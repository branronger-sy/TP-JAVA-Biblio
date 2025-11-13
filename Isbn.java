import java.util.*;
public final class Isbn {
    private final String isbn;
    public Isbn(String isbn){
        if(this.isValide(isbn))
        this.isbn=isbn;
        else {
            throw new ExceptionInInitializerError("Invalide Isbn");
        }
    }
    public Boolean isValide(String isbn){
        return isbn.matches("^[0-9]+$");
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(!(obj instanceof Isbn))
        return false;
        Isbn ISBN=(Isbn)obj;
        return this.isbn.equals(ISBN.isbn);
    }
    @Override
    public String toString(){
        return isbn;
    }
    @Override
    public int hashCode() {
        return this.isbn.hashCode();
    }
    public String getIsbn(){
        return isbn;
    }
}

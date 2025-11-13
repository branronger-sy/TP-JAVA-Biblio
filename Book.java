import java.util.*;
public class Book {
    private Isbn isbn;
    private String title;
    private String author;
    private int publicationYear;
    public Book(Isbn isbn, String title, String author, int publicationYear){
        if(title==null){
            throw new ExceptionInInitializerError("Title should have a string value");
        }
        if(author==null){
            throw new ExceptionInInitializerError("Author should have a string value");
        }
        if(publicationYear>2025){
            throw new ExceptionInInitializerError("Publication year can not be in the future");
        }
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.publicationYear=publicationYear;
    };
    @Override
    public boolean equals(Object obj){
        if(this == obj)return true;
        if(!(obj instanceof Book))
        return false;
        Book book=(Book)obj;
        return this.isbn.equals(book.isbn) && this.title.equals(book.title) && this.author.equals(book.author) && (publicationYear==book.publicationYear);
    }
    @Override
    public int hashCode() {
        return this.isbn.hashCode();
    }
    public String toString(){
        return "ISBN: "+isbn.toString()+"\nTitle: "+this.title+"\nAuthor: "+this.title+"\nPublication Year: "+this.publicationYear;
    }
    public Isbn getIsbn(){
        return isbn;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPublicationYear(){
        return publicationYear;
    }
}

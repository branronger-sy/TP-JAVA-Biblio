import java.util.Arrays;
import java.time.LocalDate;
public class Library {
    private Book[] books;
    private Member[] members;
    private Loan[] loans;

    public Library() {
        this.books = new Book[0];
        this.members = new Member[0];
        this.loans = new Loan[0];
    }
    public void addBook(Book BOOK){
        for(Book book:this.books){
            if(book.getIsbn().equals(BOOK.getIsbn()))
            throw new ExceptionInInitializerError("Book DUPLICATED!!");
            if(book==null)
            throw new ExceptionInInitializerError("Shouldn't be null");
        }
        books=Arrays.copyOf(books,books.length+1);
        books[books.length-1]=BOOK;
    }
    public void registerMember(Member member){
        for(Member MEMBER:this.members){
            if(MEMBER.getId()==member.getId())
            throw new ExceptionInInitializerError("member DUPLICATED!!");
            if(member==null)
            throw new ExceptionInInitializerError("Shouldn't be null");
        }
        members=Arrays.copyOf(members,members.length+1);
        members[members.length-1]=member;
    }
    public void loanBook(Book book,Member member, LocalDate loanDate, LocalDate dueDate){
        Boolean EXIST=false;
        for(Book BOOK:this.books){
            if(BOOK.equals(book))
            EXIST=true;
        }
        if(EXIST) throw new ExceptionInInitializerError("book non exist");
        EXIST=false;
        for(Member MEMBER:this.members){
            if(MEMBER.equals(member))
            EXIST=true;
        }
        if(EXIST) throw new ExceptionInInitializerError("member non registred");
        Loan loan=new Loan(book, member,loanDate,dueDate);
        loans=Arrays.copyOf(loans, loans.length+1);
        loans[loans.length-1]=loan;
    }
    public Loan[] getCurrentLoans(){
        Loan[] current = new Loan[0];
        for(Loan loan:loans){
            if(!loan.getStatus().equals("RETURNED")){
                current=Arrays.copyOf(current, current.length+1);
                current[current.length-1]=loan;
            }
        }
        return current;
    }
}

import java.time.LocalDate;
public class Loan {
    private Book book;
    private Member member;
    private LocalDate loanDate;
    private LocalDate dueDate;
    private String status;

    public Loan(Book book, Member member, LocalDate loanDate, LocalDate dueDate) {

        if (book == null)  throw new IllegalArgumentException("Invalid book");
        if (member == null) throw new IllegalArgumentException("Invalid member");
        if (loanDate == null && loanDate.isAfter(LocalDate.now())) throw new IllegalArgumentException("Invalid loan date");
        if (dueDate == null && dueDate.isAfter(LocalDate.now())) throw new IllegalArgumentException("Invalid due date");
        

        this.book = new Book(
            new Isbn(book.getIsbn().getIsbn()),
            book.getTitle(),
            book.getAuthor(),
            book.getPublicationYear()
        );
        this.member = new Member(
            member.getId(),
            member.getFullName(),
            new Email(member.getEmail().getEmail()),
            member.getRegistrationDate()
        );

        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.status = "ONGOING";
    }
    public boolean isLate(){
        return LocalDate.now().isAfter(dueDate);
    }
    public void updateStatus(){
        if(this.isLate() && this.status=="RETURNED"){
            this.status="LATE";
        }
    }
    public String getStatus(){
        return this.status;
    }
}

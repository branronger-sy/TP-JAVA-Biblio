public class Loan {
    private Book book;
    private Member member;
    private Date loanDate;
    private Date dueDate;
    private String status;
    public Loan(Book book, Member member, Date loanDate, Date dueDate, String status) {
        if (book==null) throw new ExceptionInInitializerError("Invalid book");
        if (member==null) throw new ExceptionInInitializerError("Invalid member");
        if (loanDate==null) throw new ExceptionInInitializerError("Invalid loan date");
        if (dueDate==null) throw new ExceptionInInitializerError("Invalid due date");
        if (status==null) throw new ExceptionInInitializerError("Invalid status");
        this.book=new Book(
            new Isbn(book.getIsbn().getIsbn()),
            book.getTitle(),
            book.getAuthor(),
            book.getPublicationYear()
        );
        this.member = new Member(
            member.getId(),
            member.getFullName(),
            new Email(member.getEmail().getEmail()),
            new Date(
                member.getRegistratioDate().getDay(),
                member.getRegistratioDate().getMonth(),
                member.getRegistratioDate().getYear()
            )
        );
        this.loanDate = new Date(
            loanDate.getDay(),
            loanDate.getMonth(),
            loanDate.getYear()
        );
        this.dueDate = new Date(
            dueDate.getDay(),
            dueDate.getMonth(),
            dueDate.getYear()
        );
        this.status = status;
    }
}

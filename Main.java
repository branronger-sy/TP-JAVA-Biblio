import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book(new Isbn("1234567890"), "Justice", "Abdessalam YASSINE", 2013);
        Book book2 = new Book(new Isbn("9876543210"), "Ainsi parlait Zarathoustra", "Friedrich Nietzsche", 1883);
        library.addBook(book1);
        library.addBook(book2);
        Member member1 = new Member(1, "ISSAM AFJDGHIGH", new Email("i.afjdghigh6256@gmail.com"), LocalDate.of(2023, 1, 15));
        Member member2 = new Member(2, "L3arbi BATMA", new Email("L3ARBIBATMA@naslghiwane.ma"), LocalDate.of(1993, 5, 20));
        library.registerMember(member1);
        library.registerMember(member2);
        library.loanBook(book1, member1, LocalDate.of(2025, 11, 1), LocalDate.of(2025, 11, 10));
        library.loanBook(book2, member2, LocalDate.of(2025, 11, 5), LocalDate.of(2025, 11, 12));
        System.out.println("Current Loans:");
        for (Loan loan : library.getCurrentLoans()) {
            System.out.println("Book: " + loan.getStatus() + " | Status: " + loan.getStatus());
        }
        Loan[] currentLoans = library.getCurrentLoans();
        for (Loan loan : currentLoans) {
            System.out.println("Book: " + loan.getStatus() + " | ");
            loan.updateStatus();
            System.out.println("Updated Status: " + loan.getStatus());
        }
        System.out.println("\n=== Testing Book ===");
        System.out.println("book1.toString():\n" + book1);
        System.out.println("book2.toString():\n" + book2);
        System.out.println("book1.equals(book2)? " + book1.equals(book2));
        System.out.println("book1.hashCode(): " + book1.hashCode());
        System.out.println("book2.hashCode(): " + book2.hashCode());
        System.out.println("\n=== Testin Member ===");
        System.out.println("member1.toString():\n" + member1.getFullName() + ", " + member1.getEmail());
        System.out.println("member2.toString():\n" + member2.getFullName() + ", " + member2.getEmail());
        System.out.println("member1.equals(member2)? " + member1.equals(member2));
        System.out.println("member1.hashCode(): " + member1.hashCode());
        System.out.println("member2.hashCode(): " + member2.hashCode());
        System.out.println("\n=== Test Loan ===");
        Loan loan1 = currentLoans[0];
        Loan loan2 = currentLoans[1];
        System.out.println("loan1 status: " + loan1.getStatus());
        System.out.println("loan2 status: " + loan2.getStatus());
        System.out.println("loan1.equals(loan2)? " + loan1.equals(loan2));
        System.out.println("loan1.hashCode(): " + loan1.hashCode());
        System.out.println("loan2.hashCode(): " + loan2.hashCode());
    }
}

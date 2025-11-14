import java.time.LocalDate;

public class Member {
    private final int id;
    private String fullName;
    private Email email;
    private LocalDate registrationDate;
    public Member(int id, String fullName, Email email, LocalDate registrationDate){
        if(id == 0){
            throw new IllegalArgumentException("ID cannot be zero");
        }
        if(fullName == null){
            throw new IllegalArgumentException("Full name must be provided");
        }
        if(email == null){
            throw new IllegalArgumentException("Email must be provided");
        }
        if(registrationDate == null && registrationDate.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Registration date must be provided");
        }

        this.email = email;
        this.fullName = fullName;
        this.id = id;
        this.registrationDate = registrationDate;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Member)) return false;

        Member member = (Member) obj;

        return this.id == member.id &&
               this.fullName.equals(member.fullName) &&
               this.email.equals(member.email) &&
               this.registrationDate.equals(member.registrationDate);
    }

    @Override
    public int hashCode() {
        return id;
    }

    public int getId(){
        return id;
    }

    public String getFullName(){
        return fullName;
    }

    public Email getEmail(){
        return email;
    }

    public LocalDate getRegistrationDate(){
        return registrationDate;
    }
}

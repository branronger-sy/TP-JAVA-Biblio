import java.util.*;
public class Member {
    private final int id;
    private String fullName;
    private Email email;
    private Date registrationDate;
    public Member(int id, String fullName, Email email, Date registrationDate){
        if(id==0){
            throw new ExceptionInInitializerError("Title should have a string value");
        }
        if(fullName==null){
            throw new ExceptionInInitializerError("Author should have a string value");
        }
        this.email=email;
        this.fullName=fullName;
        this.id=id;
        this.registrationDate = new Date(
            registrationDate.getDay(),
            registrationDate.getMonth(),
            registrationDate.getYear()
        );
    };
    @Override
    public boolean equals(Object obj){
        if(this == obj)return true;
        if(!(obj instanceof Member))
        return false;
        Member member=(Member)obj;
        return this.email.equals(member.email) && this.fullName.equals(member.fullName) && this.id==member.id && this.registrationDate.equals(member.registrationDate);
    }
    @Override
    public int hashCode() {
        return this.id;
    }
    public String toString(){
        return "EMAIL: "+email.toString()+"ID: "+this.id+"\nFullName: "+this.fullName+"\nRegistration Date: "+this.registrationDate;
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

    public Date getRegistratioDate(){
        return new Date(registrationDate.getDay(), registrationDate.getMonth(), registrationDate.getYear());
    }

}

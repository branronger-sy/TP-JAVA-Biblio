import java.util.*;
public final class Email {
    private final String email;
    public Email(String email){
        if(this.isValide(email))
        this.email=email;
        else {
            throw new ExceptionInInitializerError("Invalide mail");
        }
    }
    public Boolean isValide(String email){
        return email!=null && email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9._%+-]+.[a-zA-Z]{2,}$");
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(!(obj instanceof Email))
        return false;
        Email mail=(Email)obj;
        return this.email.equals(mail.email);
    }
    @Override
    public String toString(){
        return email;
    }
    @Override
    public int hashCode() {
        return this.email.hashCode();
    }
    public String getEmail(){
        return email;
    }
}

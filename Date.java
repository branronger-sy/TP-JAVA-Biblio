import java.util.*;
public class Date {
    private int Day;
    private int Month;
    private int Year;
    public Date(int Day,int Month, int Year){
        if(Day<=0 || Day>31)
            throw new ExceptionInInitializerError("Day should be in range [1,31]");
        if(Month<=0 || Month>12)
            throw new ExceptionInInitializerError("Month should be in range [1,12]");
        if(Year>2025)
            throw new ExceptionInInitializerError("Year can't be in the future");
        this.Day = Day;
        this.Month = Month;
        this.Year = Year;
    }
    @Override
    public String toString(){
        return this.Day+"/"+this.Month+"/"+this.Year;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(!(obj instanceof Date))
        return false;
        Date D=(Date)obj;
        return D.Day==this.Day && this.Month==D.Month && D.Year==this.Year;
    }
    public void setDay(int Day){
        this.Day=Day;
    }
    public void setMonth(int Month){
        this.Month=Month;
    }
    public void setYear(int Year){
        this.Year=Year;
    }
    public int getDay(){
        return this.Day;
    }
    public int getMonth(){
        return this.Month;
    }
    public int getYear(){
        return this.Year;
    }
}

package DateTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalc {
    public static void main(String[] args) {
        LocalDate dob=LocalDate.of(2003,4,15);
        LocalDate cdt=LocalDate.now();
        Period p=Period.between(dob,cdt);
        //System.out.println(p.getYears());
        System.out.println("No of Years:"+p.getYears() +" and No of Months:"+p.getMonths() +" and No of Days:" +p.getDays());
    }
}

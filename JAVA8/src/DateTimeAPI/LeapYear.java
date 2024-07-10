package DateTimeAPI;


import java.time.Year;

public class LeapYear {
    public static void main(String[] args) {
        /*int year= Year.now().getValue();
        System.out.println(year);
        if(year%4 ==0){
            System.out.println( "Current year is leap year");
         else{
             System.out.println("Current year is not leap year");*/
        System.out.println(Year.now().isLeap());
        Year year=Year.of(2019);
        System.out.println(year.isLeap());
        if(year.isLeap()) {
            System.out.println("Leap Year");
        }
         else{
             System.out.println("Not Leap Year");
            }
    }
}

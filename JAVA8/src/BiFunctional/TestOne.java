package BiFunctional;


import java.sql.SQLOutput;
import java.util.function.BiFunction;

interface Test{
    public abstract int apply(String fname, String lname);
}
public class TestOne implements Test {
    public int apply(String fname, String lname){
        return(fname+lname).length();
    }

    public static void main(String[] args) {
        Test obj=new TestOne();
        System.out.println(obj.apply("rahul","gandi"));

        //with lambda
        Test obj1=(fn,ln)->(fn+ln).length();
        System.out.println(obj1.apply("preeti","magadum"));

        BiFunction<String,String,Integer> obj2=(f,l)->(f+l).length();
        System.out.println(obj2.apply("swati","patil"));
    }
}

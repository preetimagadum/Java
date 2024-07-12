package StreamAPI;

import java.util.ArrayList;

public class StreamEx1{
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(44);
        numbers.add(75);
        numbers.add(18);
        numbers.add(199);
        numbers.add(20);
        numbers.add(71);
        numbers.add(14);
        System.out.println(numbers);
        numbers.stream().filter(number->number%2 ==0)
                .forEach(number-> System.out.println(number));
        /*
        for (Integer number:numbers) {
            if(number %2 ==0){
                System.out.println(number);
            }
        } */
    }
}
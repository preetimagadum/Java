package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx{
    public static void main(String[] args) {
        //List<Integer> numbers=Arrays.asList(44,75,18,199,20,71,14);
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(44);
        numbers.add(75);
        numbers.add(18);
        numbers.add(199);
        numbers.add(20);
        numbers.add(71);
        numbers.add(14);
        System.out.println(numbers);
        List even_Numbers=numbers.stream()
                .filter(num->num%2 ==0)
                .collect(Collectors.toList());
        System.out.println(even_Numbers);

    }
}
package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamEx8 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("preeti","swati","Anu","rahul","Sonia","priya");
        System.out.println(names);
        //names.stream().filter(name->name.startsWith("p")).forEach(System.out::println);
        names.stream().filter(name->name.startsWith("p")).forEach(name->System.out.println(name));

    }
}

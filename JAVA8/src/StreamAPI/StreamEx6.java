package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamEx6 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("anu","preeti","swati","priya","rahul");
       long no_names=names.stream().filter(name->name.startsWith("p")).count();
        System.out.println(no_names);
    }
}

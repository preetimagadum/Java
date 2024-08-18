package StreamAPI;

import java.util.*;

public class StreamEx5 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("preeti","swati","Anu","rahul","Sonia");

        List<String> new_names=new ArrayList<String>();
        Collections.sort(names);
        System.out.println(names);
        for(String name: names){
            new_names.add(name.toUpperCase());
            System.out.println(new_names);

        }

    }
}






package StreamAPI;

import java.util.*;

public class StreamEx7 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("preeti","swati","Anu","rahul","Sonia","priya");
        System.out.println(names);
        int no_of_names=0;
        Iterator itr=names.iterator();
        while(itr.hasNext()){
            if(itr.next().toString().startsWith("A")){
                no_of_names++;
            }
        }
        System.out.println(no_of_names);

    }
}

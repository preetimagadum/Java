package StreamAPI;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx4 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("swati");
        names.add("preeti");
        names.add("rahul");
        names.add("sonia");
        names.add("priyanka");;
        names.add("priya");
        //System.out.println(names);
        List<String> new_Names=names.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(names);
        System.out.println(new_Names);
    }
}

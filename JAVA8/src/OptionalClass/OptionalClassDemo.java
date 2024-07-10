package OptionalClass;

import java.util.Optional;

public class OptionalClassDemo {
    public static void main(String[] args) {
        String s1="Rahul";
        Optional opt=Optional.ofNullable(s1);
        if(opt.isPresent()){
            System.out.println(opt.get().toString().toUpperCase());
        }
        else{
            System.out.println("Not Present");
        }
    }
}

import java.util.*;

class Test{
    public static void main(String[] args){
        PriorityQueue<String> enames=new PriorityQueue<String>();

        //System.out.println(enames.element());
        //System.out.println(enames.peek());
        enames.offer("Rahul");
        System.out.println(enames);
        enames.remove("rahul");
        System.out.println(enames);

    }
}
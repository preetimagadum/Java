import java.util.*;
class Test{
    public static void main(String[] args){
        PriorityQueue<String> enames= new PriorityQueue<String>();
        System.out.println(enames);
        enames.add("Preeti");
        enames.add("Swati");
        enames.add("Sunita");
        enames.add("Shruti");
        System.out.println(enames);

        enames.offer("Preeti");
        enames.offer("Swati");
        System.out.println(enames);

        /*enames.poll("Swati");
        System.out.println(enames);*/
    }
}
import java.util.*;

class Test{
    public static void main(String[] args){
        HashMap<String,String> emp=new HashMap<String,String>();
        System.out.println(emp);
        emp.put("id","101");
        emp.put("name","Rahul");
        emp.put("sal","45000");
        emp.put(null,null);
        //System.out.println(emp);

        emp.get("id");
        System.out.println(emp);
    }
}
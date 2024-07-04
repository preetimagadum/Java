import java.util.*;

class Test{
    public static void main(String[] args){
        HashMap<String,String> product=new HashMap<String,String>();
        product.put("pId","101");
        product.put("name","Vivo");
        product.put("price","14000");
        product.put("color","Blue");
        product.put("avail","true");
        System.out.println(product);
        System.out.println("Display the key and values using entry set");

        Set<Map.Entry<String,String>> entries=product.entrySet();

        for(Map.Entry<String,String> entry : entries){
            System.out.println(entry.getKey()+ ":" +entry.getValue());
        }
     }
}
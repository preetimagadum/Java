package FI;

interface Dao{
    int add (int a,int b);
}
public class CalcI implements Dao {
    public int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Dao obj=new CalcI();
        System.out.println(obj.add(10,20));
    }
}

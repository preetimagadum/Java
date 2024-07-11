package FI;

@FunctionalInterface
interface DaoI{
    public abstract int add(int a, int b);
}
public class Calc1 {
    public static void main(String[] args) {
        DaoI dao=(a,b)->a+b;
        System.out.println(dao.add(19,45));
    }
}

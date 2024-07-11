package FI;

@FunctionalInterface
interface DaoI1{
    public abstract void login();
}
public class DaoImpl implements DaoI1 {
    public void login(){
        System.out.println("Login Successfully");
    }

    public static void main(String[] args) {
        DaoI1 obj=new DaoImpl();
       obj.login();
    }
}

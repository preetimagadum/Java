package StaticMathod;

interface DaoI{
    public static void greet(){
        System.out.println("Hello Java8");
    }
    public abstract void login();
    public abstract void logout();

}
public class StaticEx implements DaoI{
    public void login(){

    }
    public void logout(){

    }

    public static void main(String[] args) {
        DaoI.greet();
    }
}

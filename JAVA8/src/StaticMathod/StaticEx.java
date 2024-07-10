package StaticMathod;

interface DaoI{
    public static void greet(){
        System.out.println("Hello");
    }
    public abstract void login();

    public abstract void logout();
}

public class StaticEx implements DaoI{
    DaoI.greet();
    public static void main(String[] args) {

    }
}

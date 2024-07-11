package DefualtMethod;

interface DaoI{
    public abstract void login();
    public abstract void logout();
    public default void updateProfile(){
        System.out.println("Updating Profile");
    }

}
public class DefaultEx implements DaoI {
    public void login(){
        System.out.println("Login Successfully");
    }
    public void logout(){
        System.out.println("Logout Successfully");
    }

    public static void main(String[] args) {
        DaoI obj=new DefaultEx();
        obj.login();
        obj.logout();
        obj.updateProfile();
    }
}

package FI;
interface DiaImp{
    public abstract void login();
}
public class DaoI implements DioImp {
    public void login(){
        System.out.println("login Successfully");
    }
    public static void main(String[] args){
        DaoImp dao=new DaoI();
        dao.logi();
    }
}

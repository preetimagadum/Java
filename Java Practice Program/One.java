class Computer{
    public void Mymusic(){
       System.out.println("music");
    }

   public String getPen(){
        return "pen";
    }
}

public class One{
        public static void main(String args[]){
            Computer obj=new Computer();

            obj.Mymusic();
            obj.getPen();
        }
    }

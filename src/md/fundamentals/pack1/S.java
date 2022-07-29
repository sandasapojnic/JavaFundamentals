package md.fundamentals.pack1;
import md.fundamentals.pack2.U;

public class S {
    private void ms(){
        System.out.println("The private method from the class S");
    }
    public void xs(){
        System.out.println("The public method from the class S");
        U u =new U();
        u.du();
    }
    void ds(){
        System.out.println("The default method from the class S");
    }
  public static void main(String[] args){
        S s=new S();
        s.xs();

  }
}

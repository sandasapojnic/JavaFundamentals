package md.fundamentals.pack1;

public class N {
   private void privateMethod1(){
       System.out.println("Private1");
   }
   private void privateMethod2(){
       System.out.println("Private2");
   }
   public void publicMethod(){
       System.out.println("-------New class with 2 private method-------");
       privateMethod1();
       privateMethod2();
   }
}

package md.fundamentals.pack2;

import md.fundamentals.pack1.N;
import md.fundamentals.pack3.Z;

public class U {
    private void vu(){
        System.out.println("The private method from the class U");
    }
    public void du(){
        System.out.println("The public method from the class U");
        Z z = new Z();
        z.sz();
        N n = new N();
        n.publicMethod();

    }
    void wu(){
        System.out.println("The default method from the class U");
    }

}

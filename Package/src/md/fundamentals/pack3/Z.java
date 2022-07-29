package md.fundamentals.pack3;

import md.fundamentals.pack1.Bonus;
import md.fundamentals.pack1.S;

public class Z {
    private void lz(){
        System.out.println("The private method from the class Z");
    }
    public void sz(){
        S s=new S();
        System.out.println("The public method from the class Z");
        Bonus b =new Bonus();
        b.setAge(23);
        b.setName("Ana");
        b.value();
    }
    void fz(){
        System.out.println("The default method from the class Z");
    }

}

package md.fundamentals.overloadmethod;



public class OverloadMeth {

    public int check(int a ,int b){
        return a+b;
    }
    public double check(double x,double y)
    {
        return x/y;
    }
    public String check(String s ,String h) {
        return s.concat(h);
    }
    public static void main (String args[]){
        OverloadMeth o=new OverloadMeth();
        System.out.println(o.check("Hello ","Friday"));
        System.out.println(o.check(17,2.3));
        System.out.println(o.check(2,9));
    }
}

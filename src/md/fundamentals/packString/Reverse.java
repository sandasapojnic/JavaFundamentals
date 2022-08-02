package md.fundamentals.packString;

public class Reverse {
    String str1="";
    public String reverseString(String s){
        char chr1;
        for(int i=s.length()-1;i>=0;i--){
         chr1= s.charAt(i);
         str1+=chr1;
        }
         return str1;
    }

    public static void main(String[] args) {
        Reverse r =new Reverse();
        System.out.print(r.reverseString("marti"));

    }
}
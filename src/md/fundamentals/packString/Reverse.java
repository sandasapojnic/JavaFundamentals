package md.fundamentals.packString;

public class Reverse {

    public String reverseString(String s){
        String str1="";
        for(int i=s.length()-1;i>=0;i--){
         str1+= s.charAt(i);
        }

         return str1;
    }

    public static void main(String[] args) {
        Reverse r =new Reverse();
        System.out.print(r.reverseString("marti"));
    }
}
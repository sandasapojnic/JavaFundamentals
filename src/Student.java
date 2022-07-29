public class Student {
    int age;
    String name;
    short year;
    double average;

    public  Student(){

    }

    public int number (int n){
        return n;
    }
    public void test(String s1, String s2){

    }
    public String getName(){
        return name;
    }
    public int value(char a){
        return a;
    }

    public void sumNum(int n){
        int sum=0;
        int i=0;
        while(i<=n) {
           sum+=i;
           i++;
        }
        System.out.println("The sum of the numbers until " +n +" is " +sum );
    }

    public void evenNum(int n){
        System.out.print("Even numbers until " + n + " are " +" ");
        for (int i=0;i<=n;i++){
            if(i%2 ==0){
                System.out.print(i + ", ");
            }
        }
    }
    public void hello()
    {
        for(int i=0;i<10;i++){
            System.out.println("Hello");
        }
    }
    public void oddNum(int n){
        System.out.print("Odd numbers until " + n + " are " +" ");
        for (int i=0;i<=n;i++){
            if(i%2!=0){
                System.out.print(i + ", ");
            }
        }
    }
}

public class Loop {
    public static void main(String[] args) {
        int sum=0;
        int d=0;
        do {
            sum+=d;
            d++;
        } while(d<=9);

        System.out.println("The sum of numbers calculated by loop do...while = "+sum);

        sum=0;
        d=0;
        while(d<=7){
            sum+=d;
            d++;
        }
        System.out.println("The sum of numbers calculated by loop while = "+sum);

        sum=0;
        for(int i=0;i<=5;i++){
            sum+=i;
        }
        System.out.println("The sum of numbers calculated by loop for  = "+sum);
    }
}

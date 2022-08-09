package md.fundamentals.array;

import java.util.Arrays;

public class Array1 {

    public int elemIndex(int[] arr, int idx){
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==idx){
                return i;
            }
          }

        return -1;
    }
    public int sum(int[] arr1){
        int s=0;
        for(int i=0;i<= arr1.length-1;i++){
            s+=arr1[i];
        }
        return s;
    }
    public int[] even(int[] eN,int n){
        int [] v=new int[n];
        int j=0;
        for(int i=0;i<= eN.length-1;i++) {
            if (eN[i] % 2 == 0) {
                    v[j]= eN[i];
                    j++;
                }
            }

      return v;
    }
    public static void main (String args[]){
       Array1 a=new Array1();
       int[] m={3,4,5,7,8};
       System.out.println("Index = "+a.elemIndex(m,5));

       Array1 aSum=new Array1();
       int[] sumArr={2,6,7,8,9,7};
       System.out.println("Sum = " + aSum.sum(sumArr));

       Array1 eNum=new Array1();
       int[]  e={2,3,5,7,9,8,6};
       int c=0;
       for (int i=0;i<=e.length-1;i++){
           if(e[i]%2==0){
               c++;
           }
       }
       System.out.println("Even = "+ Arrays.toString(eNum.even(e,c)));

    }
}

//program for print the missing element in the array
//find minimum and maximum value and print the value between this which is not present

import java.util.Arrays;
import java.util.Scanner;

public class MissingElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements value");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered array is "+Arrays.toString(arr));
        int small=arr[0];
        int big=arr[0];
        for(int i=0;i<arr.length;i++){
            if(small>arr[i])
                small=arr[i];
            if(big<arr[i])
                big=arr[i];
        }
        for(int i=small;i<big;i++){
            boolean flag=true;
            for(int j=0;j<arr.length;j++){
                if(i==arr[j])
                    flag=false;
            }
            if(flag){
                System.out.print(i+" ");
            }
        }
        sc.close();
     }
}

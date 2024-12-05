//program for replace a element with sum of digit of the element in array

import java.util.Arrays;
import java.util.Scanner;

public class sumOfDigitOfElement {
    static int sumOfDigit(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }
    
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
        for(int j=0;j<size;j++){
            arr[j]=sumOfDigit(arr[j]);
        }
        System.out.println("======================");
        System.out.println("Changed array "+Arrays.toString(arr));
        sc.close();

    }
    
}
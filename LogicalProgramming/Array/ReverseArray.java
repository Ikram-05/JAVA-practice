//Program to reverse an Array

import java.util.Scanner;

public class ReverseArray {
    
    static int[] reverse(int arr[]){
        int n=arr.length;
        int[] rev=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            rev[i]=arr[j];
            j++;
        }
        return rev;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array ");
        int s=sc.nextInt();
        int[] arr=new int[s];
        System.out.println("Enter array elemests ");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        int[] rev=reverse(arr);
        for(int i=0;i<rev.length;i++){
            System.out.print(rev[i]+" ");
        }
        sc.close();
    }
}

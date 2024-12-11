//Program for reverse an Array 

import java.util.Scanner;

public class ReverseArray1 {
    static int[] reverse(int[] arr){
        int end=arr.length-1;
        int start=0;
        while(start<end){
            int temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
        return arr;    
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

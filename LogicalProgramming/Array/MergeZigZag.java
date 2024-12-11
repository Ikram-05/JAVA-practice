//Program for merge a two arrays in zigzag format

import java.util.Arrays;
import java.util.Scanner;

public class MergeZigZag {

    static int[] merge(int[] a, int[] b) {
        int[] merged=new int[a.length+b.length];
        int index=0;
        for(int i=0;i<=merged.length/2;i++){
            if(i<a.length)
                merged[index++]=a[i];
            if(i<b.length)
                merged[index++]=b[i];
        }
        
        return merged; 
    }   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an 1st array ");
        int s=sc.nextInt();
        int[] arr=new int[s];
        System.out.println("Enter 1st array elemests ");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter size of a 2nd array ");
        int s1=sc.nextInt();
        int[] arr2=new int[s1];
        System.out.println("Enter 2nd array elemests ");
        for(int i=0;i<s1;i++){
            arr2[i]=sc.nextInt();
        }
        int[] res=merge(arr,arr2);
        System.out.println(Arrays.toString(res));
        sc.close();
    } 
}

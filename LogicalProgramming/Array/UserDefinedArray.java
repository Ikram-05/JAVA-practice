//program to get and store the values to array and print the array

import java.util.Arrays;
import java.util.Scanner;

public class UserDefinedArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter "+n+" values to add in array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        sc.close();
    }
}

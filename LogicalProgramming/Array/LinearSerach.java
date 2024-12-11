//Program for search a user element in the array in linear way

import java.util.Scanner;

public class LinearSerach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array ");
        int s=sc.nextInt();
        int[] arr=new int[s];
        System.out.println("Enter array elemests ");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a element ");
        int num=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println("The position of "+num+" is "+i);
            }
        }
        sc.close();
    }
}

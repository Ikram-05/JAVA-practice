//program for add a user given element into the user given index in array

import java.util.Arrays;
import java.util.Scanner;

public class UserEnterElement {
    static int[] addElement(int[] arr,int index,int value){
        int[] a=new int[arr.length+1];
        int j=0;
        for(int i=0;i<a.length;i++){
            if(index!=i){
                a[i]=arr[j++];
            }
            else{
                a[i]=value;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered array "+Arrays.toString(arr));
        System.out.println("\nEnter index number and value");
        int index=sc.nextInt();
        int value=sc.nextInt();
        if(index<0&&index>=size){
            int[] res=addElement(arr, index, value);
            System.out.println(Arrays.toString(res));
        }
        else{
            System.out.println("Index number is higer than the array");
        }
        sc.close();

    }
}

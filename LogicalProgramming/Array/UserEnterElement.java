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
        System.out.println("Enter index number and value");
        int index=sc.nextInt();
        int value=sc.nextInt();
        int arr[]={2,5,6,7,8};
        int[] res=addElement(arr, index, value);
        System.out.println(Arrays.toString(res));
        sc.close();

    }
}

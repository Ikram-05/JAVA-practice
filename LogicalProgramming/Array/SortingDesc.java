//Program for sort an array in desending order

import java.util.Arrays;
import java.util.Scanner;

public class SortingDesc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array ");
        int s=sc.nextInt();
        int[] arr=new int[s];
        System.out.println("Enter array elemests ");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                    
            }
        }
        System.out.println("Sorted Array : "+Arrays.toString(arr));
        sc.close();
    }
}
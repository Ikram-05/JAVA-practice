//Program to print the unique elements in user defined array

import java.util.Arrays;
import java.util.Scanner;

public class UniqueElement {    
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
            boolean flag=true;
            for(int k=0;k<size;k++){
                if(arr[j]==arr[k]&&j!=k){
                    flag=false;
                    break;
                }
            }
            if(flag)
                System.out.println(arr[j]);
        }
        sc.close();
    }
}

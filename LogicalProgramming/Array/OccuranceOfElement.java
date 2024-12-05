//Program to count the occcurence of an element in given array

import java.util.Arrays;
import java.util.Scanner;

public class OccuranceOfElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        boolean[] flag=new boolean[size];
        System.out.println("Enter elements value");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered array is "+Arrays.toString(arr));
        for(int j=0;j<size;j++){
            if(!flag[j]){
                int count=1;
                for(int k=j+1;k<size;k++){
                    if(arr[j]==arr[k]){
                        count++;
                        flag[k]=true;
                    }
                }
                System.out.println(arr[j]+"-"+count);
            }
        }
        sc.close();
    }    
}

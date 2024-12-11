//Program for print a first unique element in array

import java.util.Scanner;

public class FirstUniqueElement {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array ");
        int s=sc.nextInt();
        int[] arr=new int[s];
        System.out.println("Enter array elemests ");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            boolean flag=true;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]&&i!=j){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("First Unique element is "+arr[i]);
                break;
            }
        }
        sc.close();
    }
}

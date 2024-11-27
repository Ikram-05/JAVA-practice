//Program to print the pattern of
// 1 
// 1 2     
// 1 2 3   
// 1 2 3 4 
// 1 2 3   
// 1 2     
// 1

import java.util.Scanner;

public class PatternType35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mid=n/2+1;
        for(int i=1;i<=mid;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int j=mid-1;j>=1;j--){
            for(int k=1;k<=j;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

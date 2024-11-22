//Program for print the following pattern
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10       
// 11 12 13 14 15 

import java.util.Scanner;

public class PatternType14 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=1;
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(temp+++" ");
            }
            System.out.println();
        } 
        sc.close();
    }
}
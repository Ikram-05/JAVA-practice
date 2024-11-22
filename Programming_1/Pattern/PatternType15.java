//Program for print the pattern 
// * * * * * 
// * * * *   
// * * *     
// * *       
// *

import java.util.Scanner;

public class PatternType15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        } 
        sc.close();
    }    
}

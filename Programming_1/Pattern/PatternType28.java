// Program to print the following pattern
// * * * * * 
// *
// *   * * * 
// *       * 
// * * * * * 

import java.util.Scanner;
public class PatternType28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mid=n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n||(i==mid&&j>=mid)||(j==n&&i>=mid))
                    System.out.print("* ");
                else    
                    System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
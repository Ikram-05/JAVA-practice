//Program to print this pattern
// 1  3  5  7
// 9 11 13 15
// 17 19 21 23
// 25 27 29 31

import java.util.Scanner;
public class PatternType10 {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.printf("%3d",temp);
                temp+=2;
            }
            System.out.println();
        }
        sc.close();
    }
}

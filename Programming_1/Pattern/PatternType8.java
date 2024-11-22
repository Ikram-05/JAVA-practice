//Program for print this pattern
//   1  2  3  4  5
//   6  7  8  9 10
//  11 12 13 14 15
//  16 17 18 19 20
//  21 22 23 24 25

import java.util.Scanner;
class PatternType9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.printf("%3d",temp++);
            }
            System.out.println();
        }
        sc.close();
    }
}
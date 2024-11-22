//Program to print the pattern of 
// 5 5 5 5 5 
// 4 4 4 4 4
// 3 3 3 3 3
// 2 2 2 2 2
// 1 1 1 1 1

import java.util.Scanner;

public class PatternType7 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=num;i>=1;i--){
            for(int j=num;j>=1;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }

}

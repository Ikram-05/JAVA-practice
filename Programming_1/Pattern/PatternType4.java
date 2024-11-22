// Program to print the pattern
// 1 1 1 1 1 
// 0 0 0 0 0
// 1 1 1 1 1
// 0 0 0 0 0
// 1 1 1 1 1

import java.util.Scanner;

public class PatternType4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i%2==0)
                    System.out.print(0+" ");
                else
                    System.out.print(1+" ");
            }
            System.out.println();
        }
        sc.close();
    } 
    
}

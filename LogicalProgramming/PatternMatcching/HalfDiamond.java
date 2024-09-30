//This program for print hlaf diamond * pattern

import java.util.Scanner;
public class HalfDiamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int j=num-1;j>0;j--){
            for(int i=1;i<=j;i++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

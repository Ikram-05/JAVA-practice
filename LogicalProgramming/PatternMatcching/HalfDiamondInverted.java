//This program for print hlaf Inverted diamond * pattern

import java.util.Scanner;
public class HalfDiamondInverted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int j=n-1;j>0;j--){
            for(int i=j;i<n;i++){
                System.out.print(" ");
            }
            for(int i=1;i<=j;i++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }   
}

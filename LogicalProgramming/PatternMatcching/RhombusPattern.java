//Program for print rhombus

import java.util.Scanner;

public class RhombusPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of rhombus");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
           
            for(int j=1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

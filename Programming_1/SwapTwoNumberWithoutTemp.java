//Program for swapp two numbers without temp 

import java.util.Scanner;

public class SwapTwoNumberWithoutTemp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        
        System.out.println("After swapping the numbers ");
        System.out.println(num1);
        System.out.println(num2);
        sc.close();
    }
}
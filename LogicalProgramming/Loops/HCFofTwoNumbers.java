//This program for find HCF of two numbers

import java.util.Scanner;

public class HCFofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Two numbers ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int hcf=1;
        for(int i=1;i<=num1||i<=num2;i++){
            if(num1%i==0 && num2%i==0){
                hcf=i;
            }
        }
        System.out.println("HCF of "+num1+" and "+num2+" is " +hcf);
        sc.close();
    }    
}

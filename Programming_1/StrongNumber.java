//Program to check given number is Strong number or not 
//Strong number means sum of factorial of each digit should be equal to orginal number

import java.util.Scanner;

public class StrongNumber {
    static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    static boolean isStrong(int num){
        int sum=0,temp=num;
        while(temp!=0){
            int rem=temp%10;
            sum=sum+factorial(rem);
            temp/=10;
        }
        return sum==num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        System.out.println(isStrong(n)?"Strong Number":"Not a strong number");
        sc.close();
    }
    
}

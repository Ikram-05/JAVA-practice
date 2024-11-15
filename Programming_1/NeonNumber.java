//Program to check given number is neon number or not
//Neon number means sum of each digit of the square of the number is equal to the number

import java.util.Scanner;

public class NeonNumber {
    static boolean isNeon(int n){
        int sum=0,temp=n;
        while(temp!=0){
            int rem=temp%10;
            sum=sum+rem*rem;
            temp/=10;
        }
        return n==sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        if(isNeon(num))
            System.out.println("Neon Number");
        else
            System.out.println("Not a Neon number");
        sc.close();

    }
}

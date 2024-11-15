//This program for find a number is harshad or not 
//is a number  is completely divisible by sum of  its digits.

import java.util.Scanner;

public class HarshadNumber {
    
    static int sumOfDigit(int num){
        int sum=0;
        while(num!=0){
            int d=num%10;
            sum+=d;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=sc.nextInt();
        if(num%sumOfDigit(num)==0){
            System.out.println("Harshad number ");
        }
        else{
            System.out.println("Not a Harshad number ");
        }
        sc.close();
    }
}

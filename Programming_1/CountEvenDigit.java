//Program to count the even digits of given number

import java.util.Scanner;

public class CountEvenDigit {
    static int countEven(int num){
        int count=0;
        while(num!=0){
            int rem=num%10;
            if(rem%2==0)
                count++;
            num/=10;
        }
        return count;
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println("Even digit of given number is "+countEven(num));
        sc.close();
    }
}

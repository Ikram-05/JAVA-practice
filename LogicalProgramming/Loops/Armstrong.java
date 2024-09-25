//program for check given number is armstrong or not

import java.util.Scanner;

public class Armstrong {
    
    static int length(int n){
        int len=0;
        while(n!=0){
            n/=10;
            len++;
        }
        return len;
    }

    static int power(int n,int expo){
        int pow=1;
        for(int i=1;i<=expo;i++){
            pow=pow*n;
        }
        return pow;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int number=sc.nextInt(),copy=number;
        int expo=length(number);
        int sum=0;
        while(number!=0){
            int digit=number%10;
            sum+=power(digit, expo);
            number/=10;
        }
        String str=sum==copy?"Armstrong Number":"Not a Armstrong";
        System.out.println(str);

    }
}

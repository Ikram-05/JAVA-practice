//Program to check the number is Armstrong number or not
//Armstrong number means sum of power of each digits should be equal to orginal number

import java.util.Scanner;

public class ArmstrongNumber {
    
    static boolean isArmstrong(int n){
        int temp=n;
        double sum=0;
        String digit=n+"";
        int len=digit.length();
        while(n!=0){
            int rem=n%10;
            sum=sum+Math.pow(rem, len);
            n/=10;
        }
        return temp==sum;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(isArmstrong(num))
            System.out.println("Armstrong");
        else    
            System.out.println("Not a Armstrong");
        sc.close();
    }
}

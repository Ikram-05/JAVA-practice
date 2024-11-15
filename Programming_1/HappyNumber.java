//Program to find number is Happy number or not
//Happy number means sum of square of each digit until getting single digit
//that single digit should be equal to 1 or 7

import java.util.Scanner;

public class HappyNumber {
    static boolean isHappy(int n){
        while(n>9){
            int sum=0;
            while(n!=0){
                int rem=n%10;
                sum=sum+rem*rem;
                n/=10;
            }
            n=sum;
        }
        return n==1||n==7;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        if(isHappy(num))
            System.out.println("Happy Number");
        else
            System.out.println("Not a Happy Number");
        sc.close();
    }
}

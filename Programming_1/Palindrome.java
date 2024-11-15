//Program to check the given number is palindrome or not
//Palindrome means reverse of the number should be equal to number

import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(int num){
        int rev=0,temp=num;
        while(temp!=0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        return rev==num;
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        if(isPalindrome(num))
            System.out.println("Palindrome");
        else    
            System.out.println("Not a palindrome");

        sc.close();
    }
}

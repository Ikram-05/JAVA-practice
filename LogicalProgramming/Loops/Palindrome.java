//Program for check palindrome or not

import java.util.Scanner;

public class Palindrome {

    static int reverse(int n){
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=sc.nextInt();
        if(num==reverse(num)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}

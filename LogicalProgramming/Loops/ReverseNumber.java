//Program for a reverse a number

import java.util.Scanner;

class ReverseNumber{

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
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        System.out.println("Reverse of a number is "+reverse(number));
        sc.close();

    }
}
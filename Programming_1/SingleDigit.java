//Program to sum the digit until getting single digit

import java.util.Scanner;

public class SingleDigit {
    static int sumOfDigit(int n){
        while(n>9){
            int sum=0;
            while(n!=0){
                int rem=n%10;
                sum+=rem;
                n/=10;
            }
            n=sum;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        System.out.println(sumOfDigit(num));
        sc.close();
        
    }    
}

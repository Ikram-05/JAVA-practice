//Program to print first N prime numbers

import java.util.Scanner;

public class First_N_PrimeNumber{
    static boolean isPrime(int n){
        if(n<=1)
            return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
            return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N value");
        int n=sc.nextInt();
        sc.close();
        for(int i=1; ;i++){
            if(isPrime(i)&&n!=0){
                System.out.println(i);
                n--;
            }
            if(n==0){
                break;
            }
        }
        
    }
}
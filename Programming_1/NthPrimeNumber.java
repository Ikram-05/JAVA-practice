//Program to find a Nth prime number

import java.util.Scanner;

public class NthPrimeNumber {
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
        System.out.println("Enter the Nth value");
        int n=sc.nextInt();
        int count=0,a=2;
        while(true){
            if(isPrime(a))
                count++;
            if(count==n){
                System.out.println(a);
                break;
            }
            a++;
        }
        sc.close();
    }
    
}

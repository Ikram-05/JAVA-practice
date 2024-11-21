//Program for print all the prime numbers between 1 to n number

import java.util.Scanner;

public class TwinPrimeNumber {
    static boolean isPrime(int n){
        if(n<=1)
            return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
            return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int max=sc.nextInt();
        for(int i=1;i<=max;i++){
            if(isPrime(i)&&isPrime(i+2)){
                System.out.println("("+i+" "+(i+2)+")");
            }
        }
        sc.close();
    }
}

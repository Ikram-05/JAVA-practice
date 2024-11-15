//Program to print  sum of prime number between the range

import java.util.Scanner;
public class SumOfPrimeNumber {

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
        System.out.println("Enter Ending range ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(isPrime(i))
                sum+=i;
        }
        System.out.println("Sum of prime number between 1 to "+n+" "+sum);
        sc.close();
    }
}

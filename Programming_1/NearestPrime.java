//Program to print nearest prime number of given number

import java.util.Scanner;

public class NearestPrime {
    static boolean isPrime(int n){
        if(n<=1)
            return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
            return true;
    }
    static int nearestPrime(int num){
        if(isPrime(num))
            return num;
        int low=num-1;
        int up=num+1;
        while(true){
            if(isPrime(low))
                return low;
            else if(isPrime(up))
                return up;
            low--;
            up++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter Number");
        int num=sc.nextInt();
        System.out.println("Nearest Prime number is "+nearestPrime(num));
        sc.close();
    }
}

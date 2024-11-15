//PROGRAM TO PRINT PRIME NUMBER IN THE RANGE

import java.util.Scanner;

class PrimeNumberRange{
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
        int min=sc.nextInt();
        int max=sc.nextInt();

        for(int i=min;i<=max;i++){
            if(isPrime(i))
                System.out.println(i);
        }
        sc.close();

    }
}
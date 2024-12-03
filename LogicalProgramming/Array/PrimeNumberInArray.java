//Print the prime numbers in user defined array

import java.util.Scanner;

public class PrimeNumberInArray {
    
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
        System.out.println("Enter size of the array ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter "+n+" values to add in array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int j=0;j<a.length;j++){
            if(isPrime(a[j]))
                System.out.print(a[j]+" ");
        }
        sc.close();
    }
}

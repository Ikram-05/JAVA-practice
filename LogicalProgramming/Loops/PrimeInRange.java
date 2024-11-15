//This program for find a prime number in given range 
import java.util.Scanner;

public class PrimeInRange {

    static boolean isPrime(int n){
        int count =0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count==2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting value: ");
        int start=sc.nextInt();
        System.out.println("Enter the ending value: ");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        sc.close();
    }    
}

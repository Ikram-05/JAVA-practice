//This java program for find a primeNumber or not
import java.util.Scanner;

public class PrimeNumber {

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
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if(num==1 || num==0){
            System.out.println("Not a prime number");
        }
        else{
            if(isPrime(num)){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not a prime number");
            }
        }

    }
}

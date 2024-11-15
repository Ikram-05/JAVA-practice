//Program for print a prime factors of a number

import java.util.Scanner;

public class PrimeFactors {
   public static boolean isPrime(int n){
      int count=2;
      for(int i=2;i<=n/2;i++){
         if(n%i==0){
            count++;
         }
      }
      return count==2;
   }

   public static void factor(int n){
      for(int i=2;i<=n;i++){
         int x=0;
         if(isPrime(i)){
            x=n;
            while(x%i==0){
               System.out.println(i);
               x/=i;
            }
         }
      }
   }

   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number: ");
      int n=sc.nextInt();
      factor(n);
      sc.close();
   }

}
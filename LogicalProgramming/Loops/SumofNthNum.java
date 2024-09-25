//this program is to find the sum of Nth number
import java.util.Scanner;

public class SumofNthNum {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Nth number: ");
    int nth_term=sc.nextInt();
    int sum=0;
    for(int i=1;i<=nth_term;i++){
        sum+=i;
    }
    System.out.println("Sum of N numbers: "+sum);
   } 
}

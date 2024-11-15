//this program is to calculate the sum of number in given range
import java.util.Scanner;

public class SumofNumbersInARange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a starting range: ");
        int start=sc.nextInt();
        System.out.println("Enter a Ending range: ");
        int end=sc.nextInt();
        int sum=0;
        for(int i=start;i<=end;i++){
            sum+=i;
        }
        System.out.println("Sum of numbers in the given range: "+sum);
        sc.close();

    }
}

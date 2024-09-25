//Program for finding a number is even or odd
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num1=sc.nextInt();
        if(num1!=0){
            if(num1%2==0){
                System.out.println("Given number is Even");
            }
            else{
                System.out.println("Given number is Odd");
            }
        }
        else{
            System.out.println("Zero");
        }
    }
}

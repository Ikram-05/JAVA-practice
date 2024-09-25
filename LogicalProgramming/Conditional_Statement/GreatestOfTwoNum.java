// this java program is for find a greatest number among two numbers 
import java.util.Scanner;
public class GreatestOfTwoNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int n1=sc.nextInt();
        System.out.println("Enter a second number: ");
        int n2=sc.nextInt();
        if(n1>=n2){
            System.out.println("Greatest number is: "+n1);
        }
        else{
            System.out.println("Greatest number is: "+n2);
        }
    }
}

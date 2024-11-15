// this java program is for find a greatest number among three numbers 
import java.util.Scanner;
public class GreatestOfThreeNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int n1=sc.nextInt();
        System.out.println("Enter a second number: ");
        int n2=sc.nextInt();
        System.out.println("Enter a third number: ");
        int n3=sc.nextInt();
        if(n1>=n2 && n1>=n3){
            System.out.println("Greatest number is: "+n1);
        }
        else if(n2>=n3 ){
            System.out.println("Greatest number is: "+n2);
        }
        else{
            System.out.println("Greatest number is: "+n3);
        }
        sc.close();
    }
}

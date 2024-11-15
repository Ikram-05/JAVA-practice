//this is the program for finding a number is positive or negative
import java.util.Scanner;
class PositiveOrNegative{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        if(num!=0){
            if(num>0){
                System.out.println("Positive Number");
            }
            else{
                System.out.println("Negative Number");
            }
        }
        else{
            System.out.println("Zero");
        }
        sc.close();
    }
}
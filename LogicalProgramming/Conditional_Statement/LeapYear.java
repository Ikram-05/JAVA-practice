//this program for finding a leap year
import java.util.Scanner;

public class LeapYear {
    
    static boolean isLeapYear(int year){
        if(year%400==0){
            return true;
        }
        else if(year%4==0 && year%100!=0){
            return true;
        }
        else{
            return false;
        }
        
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year=sc.nextInt();
        if(isLeapYear(year)){
            System.out.println("Given year is leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
        sc.close();
    }
}

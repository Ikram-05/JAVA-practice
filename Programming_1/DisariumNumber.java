//PROGRAM TO CHECK THE NUMBER IS DISARIUM OR NOT
//DISARIUM NUMBER MEANS--SUM OF POWER OF EACH DIGITS BASED ON THEIR RESPECTIVE
//POSITION IS EQUAL TO THE NUMBER

import java.util.Scanner;

public class DisariumNumber {
    
    static boolean isDisarium(int n){
        int temp=n;
        double sum=0;
        String digit=n+"";
        int len=digit.length();
        while(n!=0){
            int rem=n%10;
            sum=sum+Math.pow(rem,len--);
            n/=10;
        }
        return temp==sum;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println(isDisarium(num)?"Disarium":"Not a Disarium");
        sc.close();
    }
}

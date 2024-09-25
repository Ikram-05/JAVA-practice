//Program for power a number with exponent

import java.util.Scanner;

public class PowerOfNumber {
    
    static int powerOfTheNumber(int base,int exp){
        int power=1;
        for(int i=1;i<=exp;i++){
            power*=base;
        }
        return power;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a base number: ");
        int base=sc.nextInt();
        System.out.println("Enter a exponant: ");
        int exp=sc.nextInt();
        int res=powerOfTheNumber(base, exp);
        System.out.println("Power the number is = "+res);
    }
}

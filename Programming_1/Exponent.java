//Program to Find a power of the number

import java.util.Scanner;

public class Exponent {
    static int exponent(int num,int expo){
        int pow=1;
        for(int i=1;i<=expo;i++){
            pow=pow*num;
        }
        return pow;
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Base and power number");
        int base=sc.nextInt();
        int pow=sc.nextInt();
        System.out.println(exponent(base, pow));
        sc.close();
    }
}

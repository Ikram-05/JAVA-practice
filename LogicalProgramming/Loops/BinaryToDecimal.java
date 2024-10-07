//This program for convert a binary number into decimal..

import java.util.Scanner;

public class BinaryToDecimal {


    static int power(int n){
        int base=2;
        int pow=1;
       
        for(int i=0;i<=n-1;i++){
            pow*=base;
        }

        return pow;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Binary number ");
        int binary=sc.nextInt();
        int copy=binary;
        int decimal=0;
        int n=0;
        while(binary>0){
            int d=binary%10;
            decimal+=d*power(n);
            binary/=10;
            n++;
        }
        System.out.println("Decimal of "+copy+" is "+decimal);
    }
}

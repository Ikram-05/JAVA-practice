//Progarm to convert Binary value to  Decimal

import java.util.Scanner;

public class BinaryToDecimal {

    static int binToDec(int num){
        int dec=0,n=0;
        while(num!=0){
            int rem=num%10;
            dec=dec+rem*(int)Math.pow(2, n);
            num/=10;
            n++;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(binToDec(num));
        sc.close();
    }
}
//program to convert Decimal value to Octal 

import java.util.Scanner;

public class DecimalToOctal {
    static String decToOct(int n){
        String oct="";
        while(n!=0){
            int rem=n%8;
            oct=rem+oct;
            n/=8;
        }
        return oct;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(decToOct(num));
        sc.close();
    }
}

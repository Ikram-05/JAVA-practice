//Program to convert decimal value to HexaDecimal

import java.util.Scanner;

public class DecimalToHexa {

    static String decToHexa(int n){
        String hexa="";
        while(n!=0){
            int rem=n%16;
            if(rem>9){
                hexa=(char)(rem+55)+hexa;
            }
            else{
                hexa=rem+hexa;
            }
            n/=16;
        }
        return hexa;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(decToHexa(num));
        sc.close();
    }
    
}
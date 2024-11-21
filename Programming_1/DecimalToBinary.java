//Program for convert decimal value to binary

import java.util.Scanner;

public class DecimalToBinary {
    
    static String decToBin(int n){
        String bin="";
        while(n!=0){
            int rem=n%2;
            bin=rem+bin;
            n/=2;
        }
        return bin;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(decToBin(num));
        sc.close();
    }
}

//program for check the number is automic number or not 
//example given number is 5 if the square of this number should end with the given number

import java.util.Scanner;

public class AutomorphicNumber {
    static boolean isAutomorphic(int n){
        String str=n+"";
        int len=str.length();
        int digit=(int)Math.pow(10,len);
        int res=(int)Math.pow(n,2);
        return res%digit==n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number ");
        int num=sc.nextInt();
        if(isAutomorphic(num))
            System.out.println("Automorphic number ");
        else
            System.out.println("Not a automorphic ");
        sc.close();
    }
}

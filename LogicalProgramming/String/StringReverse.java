//Program to reverse a given String

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.next();
        char[] ch=str.toCharArray();
        String rev="";
        for(int i=0;i<ch.length;i++){
           rev=ch[i]+rev;
        }
        sc.close();
        System.out.println("Reversed String is "+rev);
    }
}

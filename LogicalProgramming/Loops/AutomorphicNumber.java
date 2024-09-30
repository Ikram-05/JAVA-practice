// This program for check whether the square of the number ends with the same number or not

import java.util.Scanner;

public class AutomorphicNumber {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=sc.nextInt();
        int square=num*num;
        if(num%10==square%10){
            System.out.println("yes, its a Automorphic Number");
        }
        else{
            System.out.println("No, its not a Automorphic Number");
        }
    }   
}

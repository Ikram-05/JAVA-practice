//This program for print a triangle shaped * pattern

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a size of the triangle: ");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
 }   
}

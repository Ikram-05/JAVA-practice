//This program for create a square number increamnet pattern

import java.util.Scanner;
public class SquraeIncrement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a square size: ");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
        sc.close();

    }
}

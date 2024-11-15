//Program for print Rectangle shaped pattern

import java.util.Scanner;

public class RectanglePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and columns ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();

    }
}

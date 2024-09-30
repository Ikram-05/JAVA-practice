//This program for Diamond pattern type 2

import java.util.Scanner;
public class DiamondPattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a col ");
        int col=sc.nextInt();
        System.out.println("ENter a staring value");
        int start=sc.nextInt();
        for(int i=1;i<=col;i++){
            for(int j=1;j<=i;j++){
                System.out.println(start++);
            }
        }
    }
}

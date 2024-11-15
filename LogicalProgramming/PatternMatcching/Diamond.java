//This program for print a diamond shape * pattern

import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size: ");
        int s=sc.nextInt();
        for(int i=1;i<=s;i++){
            for(int j=i;j<s;j++){
                System.out.print(" ");
            }
            for(int j=1;j<2*i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int j=s;j>1;j--){
            for(int i=j;i<s;i++){
                System.out.print(" ");
            }
            for(int i=1;i<2*j;i++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        sc.close();

    }
}

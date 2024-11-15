//this program for print a right side triangle with adding some number

import java.util.Scanner;
public class RightTriangle1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a row ");
        int row=sc.nextInt();
        System.out.println("Enter a value to start ");
        int start=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
            }
            start++;
            System.out.println("");
        }
        sc.close();

    }
}

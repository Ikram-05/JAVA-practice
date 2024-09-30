//This program for print inverted rigth triangle with desending number 

import java.util.Scanner;
public class InveredRightTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a row ");
        int row=sc.nextInt();
        int start=row*(row+1)/2;
        for(int i=row;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(start--+" ");
            }
            System.out.println(" ");
        }

    }
}

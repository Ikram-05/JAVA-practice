//this program for right triagle number pattern

import java.util.Scanner;
public class RIgthTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of row ");
        int row=sc.nextInt();
        int temp=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(temp+++" ");
            }
            System.out.println(" ");
        }
        sc.close();

    }
}

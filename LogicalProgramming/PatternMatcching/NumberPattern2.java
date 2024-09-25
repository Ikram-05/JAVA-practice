//This program print a pattern "1" and "0" simenteniously

import java.util.Scanner;
public class NumberPattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of row ");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(j%2==0){
                    System.out.print(0+" ");
                }
                else{
                    System.out.print(1+" ");
                }   
            }
            System.out.println("");
        }
    }
}

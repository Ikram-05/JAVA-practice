// this program for Internal Varsity Number Square Printing

import java.util.Scanner;
public class VarisityPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a pattern number: ");
        int p_num=sc.nextInt();
        System.out.println("Enter a number of rows ");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            if(i==1||i==row){
                for(int j=1;j<row;j++){
                    System.out.print(p_num+" ");
                }
            }
            else{
                for(int j=1;j<row;j++){
                    if(j==1||j==row-1){
                        System.out.print(p_num+" ");
                    }
                    else{
                        System.out.print(i-1+" ");
                    }
                }
            }
            System.out.println(" ");
        }
    }    
}

//Program for print hollow shaped pyramid

import java.util.Scanner;

class HollowPyramid{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a length ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<=i;j++){
                if(i==1||j==n){
                    System.out.print(" *");
                }
            }
            System.out.println("");
        }

        
    }
}
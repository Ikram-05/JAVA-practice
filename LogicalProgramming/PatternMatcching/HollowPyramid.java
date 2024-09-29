//Program for print hollow shaped pyramid

import java.util.Scanner;

class HollowPyramid{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
        int n=sc.nextInt();
        int k=0;
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            while(k!=(2*i-1)){
                if(k==0||k==2*i-2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                k++;
            }
            k=0;
            System.out.println("");
        }

        for(int i=1;i<n*2;i++){
            System.out.print("*");
        }
       
        
    }
}
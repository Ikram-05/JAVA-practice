//program for fibnoccai series for nth term

import java.util.Scanner;

public class Fibnoccai {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Nth term ");
        int n=sc.nextInt();
        int n1=0,n2=1;
        System.out.print(n1+" "+n2);
        for(int i=1;i<=n-2;i++){
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
        }
        sc.close();
    }    
}

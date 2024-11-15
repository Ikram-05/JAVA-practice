//program for print a armstrong in a given range

import java.util.Scanner;

public class ArmstrongInRange {

    static int length(int n){
        int len=0;
        while(n!=0){
            n/=10;
            len++;
        }
        return len;
    }

    static int power(int n,int expo){
        int pow=1;
        for(int i=1;i<=expo;i++){
            pow=pow*n;
        }
        return pow;
    }

    static boolean isArmstrong(int n){
        int copy=n;
        int num=0;
        int expo=length(n);
        while(n!=0){
            int digit=n%10;
            num+=power(digit, expo);
            n/=10;
        }
        return copy==num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a starting point ");
        int start=sc.nextInt();
        System.out.println("Enter a Ending point ");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
        sc.close();
    }
}

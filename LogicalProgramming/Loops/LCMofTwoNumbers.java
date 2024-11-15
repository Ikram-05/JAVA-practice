//This program for find a LCM of two numbers

import java.util.Scanner;

public class LCMofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbers ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int max=num1>num2?num1:num2;
        int lcm=0;
        for(int i=max;i<=num1*num2;i++){
            if(i%num1==0 && i%num2==0){
                lcm=i;
                break;
            }
        }
        System.out.println("LCM of "+num1+" and "+num2+" is "+lcm);
        sc.close();
    }    
}

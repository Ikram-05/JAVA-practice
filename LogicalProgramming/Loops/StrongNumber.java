//Program for strong number  

import java.util.Scanner;

public class StrongNumber {
    static int digits(int num){
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum+=fact(digit);
            num/=10;
        }
        return sum; 
    }
    static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=sc.nextInt();
        int res=digits(num);
        System.out.println(res==num?"Strong number":"Not a Strong Number");

    }
}

//Program to check number is SpyNumber or not
//Spy number means sum of each digit should be equal to product of each digit

import java.util.Scanner;

class SpyNumber{
    static boolean isSpy(int num){
        int sum=0,product=1;
        while(num!=0){
            int rem=num%10;
            sum+=rem;
            product*=rem;
            num/=10;
        }
        return sum==product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        if(isSpy(n)) 
            System.out.println("Spy Number");
        else
            System.out.println("Not a SPy");   
        sc.close();    
    }
} 
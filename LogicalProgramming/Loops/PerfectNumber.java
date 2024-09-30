//this program for find a perfect number

import java.util.Scanner;

public class PerfectNumber {
    
    static int perfectNumber(int num){
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum;
    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=sc.nextInt();
        int res=perfectNumber(num);
        System.out.println(res==num?"Perfect Number":"Not a perfect Number");
    }    
}

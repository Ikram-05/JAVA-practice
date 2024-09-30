//sum of all the factors of a number except the number itself is greater than the number or not.

import java.util.Scanner;

public class AbundantNumber {
    
    static int sumOfFactors(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sum=sumOfFactors(n);
        if(sum>n){
            System.out.println("Yes, it's an Abundant Number ");
        }
        else{
            System.out.println("No, it's not an Abundant Number");
        }

    }
}

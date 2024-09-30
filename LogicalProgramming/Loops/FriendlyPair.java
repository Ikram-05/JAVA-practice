//this program Given Two integer inputs as the numbers,
//the objective is to check whether the ratio of the sum of the factors of the number except the number itself //
//upon the number, of the both numbers, matches or not

import java.util.Scanner;

public class FriendlyPair {
    
    static int sumOfFactors(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum1=sumOfFactors(num1);
        int sum2=sumOfFactors(num2);
        if(num1/sum1==num2/sum2){
            System.out.println("This numbers is Friendly Pair");
        }
        else{
            System.out.println("This numbers is Not Friendly Pair");
        }

    }
}

//Program to print number of factors for given number

import java.util.Scanner;

public class No_Of_Factors {
    
    static int countFactors(int n){
        int count=2;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        System.out.println("No.of Factors for given Number is "+countFactors(num));
        sc.close();

    }    
}

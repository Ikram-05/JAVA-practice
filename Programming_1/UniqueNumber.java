//Program for check the number is unique number or not 
//example 4587 it is a unique
//48768 its not unique 8 repeating

import java.util.Scanner;

public class UniqueNumber {
    static boolean isUnique(int n){
        int digit=n%10;
        n/=10;
        boolean flag=true;
        while(n>0){
            int rem=n%10;
            if(rem==digit){
                flag=false;
                break;
            }
            n/=10;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number ");
        int num=sc.nextInt();
        if(isUnique(num))
            System.out.println("Unique number ");
        else
            System.out.println("not an unique number ");
        sc.close();
    }
    
}

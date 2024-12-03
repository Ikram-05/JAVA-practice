//Program to count the palindrome element present in the array

import java.util.Scanner;

public class CountPalindrome {
    static boolean isPalindrome(int n){
        int temp=n,rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return temp==rev;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array ");
        int n=sc.nextInt();
        int[] a=new int[n];
        int count=0;
        System.out.println("Enter "+n+" values to add in array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int j=0;j<a.length;j++){
            if(isPalindrome(a[j]))
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}

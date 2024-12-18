// program for check the given string is palindrome or not

import java.util.Scanner;

class Palindrome{
    static boolean isPalindrome(String s){
        boolean flag=true;
        int len=s.length();
        for(int i=0,j=len-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                flag=false;
            }
        }
        return flag;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        if(isPalindrome(str))
            System.out.println("Palindrome ");
        else
            System.out.println("Not a palindrome");
    }
}

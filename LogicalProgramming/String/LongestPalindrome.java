//program for print longest  palindrome substring in given String

package String;

import java.util.Scanner;

public class LongestPalindrome {
	static boolean isPalindrome(String s) {
		String rev=new StringBuilder(s.toLowerCase()).reverse().toString();
		return s.equals(rev);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		String longest="";
		int len=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				String sub=str.substring(i, j);
				if(sub.length()>=len) 
					if(isPalindrome(sub)) {
						longest=sub;
						len=sub.length();
					}
			}
		}
		System.out.println(longest);
		sc.close();
	}
}

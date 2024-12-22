//Program for print longest unique Substring in  given sub String

package String;

import java.util.Scanner;

public class LongestUnique {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		String longest="";
		int len=0;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				String sub=s.substring(i,j);
				if(isUnique(sub)) {
					if(sub.length()>len) {
						longest=sub;
						len=sub.length();
					}
				}
			}
		}
		System.out.println(longest);
		sc.close();
	}

	public static boolean isUnique(String sub) {
		for(int i=0;i<sub.length();i++) {
			for(int j=i+1;j<sub.length();j++) {
				if(sub.charAt(i)==sub.charAt(j))
					return false;
			}
		}
		return true;
	}
}

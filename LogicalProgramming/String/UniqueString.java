//Program for check given String is unique or not

package String;

import java.util.Scanner;

public class UniqueString {
	static boolean isUnique(String s) {
		s=s.replaceAll(" ","");
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j))
					return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		if(isUnique(str)) 
			System.out.println("Unique String");
		else
			System.out.println("Not a uniuqe");
		sc.close();
	}
}

//Program for check the number is panagram or not

package String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Panagram {
	static boolean isPanagram(String s) {
		s=s.toLowerCase();
		Set<Character> st=new HashSet<Character>();
		for(char ch:s.toCharArray()) {
			if(ch>='a'&&ch<='z') {
				st.add(ch);
			}
		}
		return st.size()==26;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=sc.nextLine();
		if(isPanagram(s1))
			System.out.println("Panagram");
		else
			System.out.println("Not a panagram");
	}
}

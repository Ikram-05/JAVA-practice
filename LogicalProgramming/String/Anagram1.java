//Program for check the given string in anagram or not using array

package String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram1 {
	static boolean isAnagram(String s,String s1){
		char[] ch=s.toLowerCase().toCharArray();
		char[] ch1=s1.toLowerCase().toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		String str=new String(ch);
		String str1=new String(ch1);
		return str.equals(str1);
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two word");
		String s1=sc.next();
		String s2=sc.next();
		
		if(isAnagram(s1, s2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not an anagram");
		}
		
	}
}

//Program for reverse a each word in given Sentence

package String;

import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sen=sc.nextLine();
		String[] words=sen.split(" ");
		String rev="";
		for(int i=0;i<words.length;i++) {
			String temp=new StringBuilder(words[i]).reverse().toString();
			rev=rev+temp+" ";
		}
		System.out.println(rev);
		sc.close();
	}
}

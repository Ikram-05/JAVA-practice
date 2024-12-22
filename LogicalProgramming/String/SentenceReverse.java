//Program for reverse a given a sentence

package String;

import java.util.Scanner;

public class SentenceReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sen=sc.nextLine();
		String[] words=sen.split(" ");
		String rev="";
		for(int i=0;i<words.length;i++) {
			String temp=words[i];
			rev=temp+rev+" ";
		}
		System.out.println(rev);
		sc.close();
	}
}

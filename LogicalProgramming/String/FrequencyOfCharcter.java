//Program for print the occurance of the character in given String

package String;

import java.util.Scanner;

public class FrequencyOfCharcter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		char[] ch=str.toLowerCase().replaceAll(" ", "").toCharArray();
		boolean[] flag=new boolean[ch.length];
		for(int i=0;i<ch.length;i++) {
			if(flag[i]==false) {
				int count=1;
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						count++;
						flag[j]=true;
					}
				}
				System.out.println(ch[i]+" : "+count);
			}
			
		}
		sc.close();
	}
}

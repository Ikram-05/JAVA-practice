//Program for make the uppercharcter for each words first letter

package String;

import java.util.Arrays;
import java.util.Scanner;

public class UpperCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence ");
		String str=sc.nextLine();
		char[] ch=str.toLowerCase().toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i==0&&ch[i]!=' ' ||ch[i]!=' '&&ch[i-1]==' ') {
				ch[i]=Character.toUpperCase(ch[i]);
			}
		}
		System.out.println("Sentence after case convertion");
		String res=Arrays.toString(ch);
		System.out.println(res);
	}
}

// program for swap first and last character in given string 

package String;

import java.util.Scanner;

public class SwapFirstAndLastChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int f=0;
		for(int i=0;i<ch.length;i++) {
			if(i==0 && ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ') 
				f=i;
			else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ') {
				char temp=ch[f];
				ch[f]=ch[i];
				ch[i]=temp;
			}
		}
		String res=new String(ch);
		System.out.println(res);
		sc.close();
	}
}

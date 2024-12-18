//program for convert the String last character as upper and remaining lower

package String;

import java.util.Scanner;

public class LastCharUpper {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		char[] ch=str.toLowerCase().toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
				ch[i]=Character.toUpperCase(ch[i]);
		}
		String res=new String(ch);
		System.out.println(res);
		sc.close();
		
	}
}

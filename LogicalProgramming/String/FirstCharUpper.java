//Program for change the first character as upper and remaining character lower

package String;

import java.util.Scanner;

public class FirstCharUpper {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		char[] ch=str.toLowerCase().toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
				ch[i]=Character.toUpperCase(ch[i]);
		}
		String res=new String(ch);
		System.out.println(res);
		sc.close();
		
	}
}

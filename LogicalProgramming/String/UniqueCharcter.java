//Program for print the unique character in the given String 

package String;

import java.util.Scanner;

public class UniqueCharcter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		char[] ch=str.toLowerCase().replaceAll(" ", "").toCharArray();
		boolean[] flag=new boolean[str.length()];
		for(int i=0;i<ch.length;i++) {
			if(!flag[i]) {
				boolean unique=true;
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						flag[j]=true;
						unique=false;
					}
				}
				if(unique) {
					System.out.println(ch[i]);
				}
					
			}
		sc.close();
		}
	}
}

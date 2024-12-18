//Program for print the occurance of the character using HashMap

package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccuranceOfString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		str=str.toLowerCase().replaceAll(" ", "");
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(char ch:str.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		sc.close();
	}
}

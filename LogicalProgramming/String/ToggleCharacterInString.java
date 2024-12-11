//Program for change the charater into uppercase if it is in lower and vise versa

import java.util.Scanner;

public class ToggleCharacterInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String str=sc.nextLine();
        String s="";
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                s=s+Character.toLowerCase(str.charAt(i));
            }
            else{
                s=s+Character.toUpperCase(str.charAt(i)); 
            }
        }
        System.out.println("Converted String is "+s);
        sc.close();
    }
}

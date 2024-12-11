//Change the Character value to ASCII value

import java.util.Scanner;

public class ASCIIofChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter character");
        char ch=sc.next().charAt(0);
        int ascii=ch;
        System.out.println("ASCII value of given character is "+ascii); 
        sc.close();
    }
}

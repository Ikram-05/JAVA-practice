//Program for count the vowles and consonent in a String

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String value");
        String str=sc.nextLine();
        int vow=0,con=0;
        char[] temp=str.toCharArray();
        for(int i=0;i<temp.length;i++){
            if(temp[i]=='A'||temp[i]=='a'||temp[i]=='E'||temp[i]=='e'||temp[i]=='I'||temp[i]=='i'||temp[i]=='O'||temp[i]=='o'||temp[i]=='U'||temp[i]=='u')
                vow++;
            else
                con++;
        }
        sc.close();
        System.out.println("Vowels "+vow);
        System.out.println("Consonent "+con);
        
    }
}

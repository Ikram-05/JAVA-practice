//Program for count the Alaphets,Numbers and special character in given String

import java.util.Scanner;

public class StringCharCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String value");
        String str=sc.next();
        int alpha=0,num=0,spl=0;
        char[] temp=str.toCharArray();
        for(int i=0;i<temp.length;i++){
            if(temp[i]>=48 && temp[i]<=57)
                num++;
            else if(temp[i]>='A'&&temp[i]<='Z'||temp[i]>='a'&&temp[i]<='z')
                alpha++;
            else
                spl++;
        }
        sc.close();
        System.out.println("Alphates "+alpha);
        System.out.println("Numbers "+num);
        System.out.println("Special char "+spl);
        
    }
}

//Program for count the words in given sentence

import java.util.Scanner;

class WordsCount{
    static int countWords(String s){
        int count=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(i==0 && ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
                count++;
        }
        return count;

    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence");
        String str=sc.nextLine();
        System.out.println(countWords(str));
        sc.close();
    }
}
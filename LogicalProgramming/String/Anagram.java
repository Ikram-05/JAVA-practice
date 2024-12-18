//Program for check the given two word is anagram or not

import java.util.*;

class Anagram{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=sc.next();
        List<Character> word_1=new <Character> ArrayList();
        for(int i=0;i<str.length();i++){
            word_1.add(str.charAt(i));
        }
        List<Character> word_2=new <Character> ArrayList();
        for(int i=0;i<str1.length();i++){
            word_2.add(str1.charAt(i));
        }
        boolean isAnagram=word_1.containsAll(word_2);
        if(isAnagram)
            System.out.println("Anagram");
        else
            System.out.println("Not an Anagaram");

        
    }
}
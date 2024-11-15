// this program for print a right triangle with various value

import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a col ");
        int col=sc.nextInt();
        System.out.println("Enter a starting value");
        int start=sc.nextInt();
        for(int i=1;i<=col;i++){
            for(int j=1;j<=i;j++){
                System.out.print(start);
            }
            start++;
            System.out.println("");   
        }
        start--;
        for(int i=col;i>1;i--){
            start--;
            for(int j=1;j<i;j++){
                System.out.print(start);
            }
            System.out.println("");
        }
        sc.close();
    }
}

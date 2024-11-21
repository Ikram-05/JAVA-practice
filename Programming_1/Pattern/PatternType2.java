//Program to print the Pattern
// 1 1 1 1 
// 2 2 2 2
// 3 3 3 3
// 4 4 4 4

package Pattern;
import java.util.Scanner;

public class PatternType2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }  
}

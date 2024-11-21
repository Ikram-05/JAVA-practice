// Program to print the pattern
// 1 2 3 4 5 
// 1 2 3 4 5 
// 1 2 3 4 5 
// 1 2 3 4 5 
// 1 2 3 4 5 

package Pattern;
import java.util.Scanner;

public class PatternType3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    } 
}

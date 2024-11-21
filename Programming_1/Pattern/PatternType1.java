//Progam to print this pattern
// * * * * * 
// * * * * * 
// * * * * *
// * * * * * 
// * * * * * 

package Pattern;
import java.util.Scanner;

public class PatternType1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }    
}
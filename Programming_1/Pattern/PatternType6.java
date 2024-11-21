// Program to print the pattern of
// 5 4 3 2 1 
// 5 4 3 2 1
// 5 4 3 2 1 
// 5 4 3 2 1
// 5 4 3 2 1

package Pattern;
import java.util.Scanner;

public class PatternType6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=num;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

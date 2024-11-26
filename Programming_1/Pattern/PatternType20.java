// Program to print the following pattern
//     1
//    123
//   12345
//  1234567
// 123456789

import java.util.Scanner;
public class PatternType20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            int a=1;
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print(a++);
            }
            System.out.println();
        }
        sc.close();
    }
    
}
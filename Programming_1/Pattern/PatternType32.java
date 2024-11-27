//Program to print the pattern of
//       A 
//     A B C 
//   A B C D E 
// A B C D E F G 
//   A B C D E 
//     A B C 
//       A 
import java.util.Scanner;

public class PatternType32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mid=n/2+1;
        for(int i=1;i<=mid;i++){
            for(int j=1;j<=mid-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print((char)(64+k)+" ");
            }
            System.out.println();
        }
        for(int j=mid-1;j>=1;j--){
            for(int k=1;k<=mid-j;k++){
                System.out.print("  ");
            }
            for(int l=1;l<=(2*j)-1;l++){
                System.out.print((char)(64+l)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

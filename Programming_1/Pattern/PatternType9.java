//Program for print this pattern
// 1 0 1 0 1 
// 0 1 0 1 0 
// 1 0 1 0 1 
// 0 1 0 1 0 
// 1 0 1 0 1 

import java.util.Scanner;

public class PatternType9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int temp=1;    we can achive in this way also
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                // System.out.print(temp++%2+" ");
                //start i from 0 and do System.out.print((i+j)%2+" ")
                if((i%2==0&&j%2==0)||(i%2!=0&&j%2!=0)){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

//Program to find the add the armstrong element i the array

import java.util.Scanner;

public class SumOfArmsStrong {
    static boolean isArmstrong(int n){
        int temp=n,sum=0;
        String str=n+"";
        int len=str.length();
        while(n>0){
            int rem=n%10;
            sum=sum+(int)Math.pow(rem,len);
            n/=10;
        }
        return sum==temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array ");
        int n=sc.nextInt();
        int[] a=new int[n];
        int sum=0;
        System.out.println("Enter "+n+" values to add in array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int j=0;j<a.length;j++){
            if(isArmstrong(a[j]))
                sum+=a[j];
        }
        System.out.println(sum);
        sc.close();
    }
}

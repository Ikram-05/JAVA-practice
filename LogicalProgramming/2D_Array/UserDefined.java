package TwoD_Array;

import java.util.Scanner;

public class UserDefined {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of 2D array");
		int len=sc.nextInt();
		int[][] arr=new int[len][];
		System.out.println("Enter size of inner arras");
		for(int i=0;i<len;i++) {
			int in=sc.nextInt();
			arr[i]=new int [in];
		}
		System.out.println("===================");
		System.out.println("Enter elemets to add");
		for(int i=0;i<arr.length;i++) {
			int s=arr[i].length;
			for(int j=0;j<s;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("============");
		for(int i=0;i<arr.length;i++) {
			int s=arr[i].length;
			for(int j=0;j<s;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
		
	}
}

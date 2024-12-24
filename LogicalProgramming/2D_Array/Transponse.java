//Program for change the rows and column values into column and row wise

package TwoD_Array;
import java.util.Scanner;

public class Transponse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int s=sc.nextInt();
		int[][] arr= new int[s][s];
		//Getting elements from user
		System.out.println("Enter array elements ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		//Printing the user entered array
		System.out.println("Arrays before swapping");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		//Transpose logic
		int[][] changed=new int[s][s];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				changed[j][i]=arr[i][j];
			}
		}
		
		//Printing swapped array
		System.out.println("Arrays After swapping");
		for(int i=0;i<changed.length;i++) {
			for(int j=0;j<changed.length;j++) {
				System.out.print(changed[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}

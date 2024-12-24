//Program for find the sum of row and sum of column

package TwoD_Array;
import java.util.Scanner;

public class SumOfRowAndColumn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of outer array");
		int s=sc.nextInt();
		int[][] arr=new int[s][];
		
		//creating a array
		System.out.println("Enter size of Inner array's");
		for(int i=0;i<arr.length;i++) {
			int in=sc.nextInt();
			arr[i]=new int[in];
		}
		//adding elements
		System.out.println("Enter elemets to add");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		//sum of row
		System.out.println("Sum of elements row wise");
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
			System.out.println(sum);
		}
		//sum of column
		System.out.println("Sum of elements column wise");
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
			System.out.println(sum);
		}
		sc.close();
	}
}

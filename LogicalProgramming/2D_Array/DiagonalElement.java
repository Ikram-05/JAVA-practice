//program for print the diagonal and secondary diagonal values of an 2D array 

package TwoD_Array;

public class DiagonalElement {
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		//Diagonal
		System.out.println("Primary Diagonal");
		for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i][i]+" ");
		}
		System.out.println();
		
		
		//Secondary Diagonal
		System.out.println("Secondary diagonal");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i][arr.length-1-i]+" ");
		}
	}
}

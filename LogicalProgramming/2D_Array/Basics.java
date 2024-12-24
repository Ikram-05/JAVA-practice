//Program for add and print the elements in 2D array

package TwoD_Array;

public class Basics {
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5},{6,7,8,9}};
		for(int i=0;i<arr.length;i++) {
			int len=arr[i].length;
			for(int j=0;j<len;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

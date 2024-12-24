//program for find the sum of elements in 2D array

package TwoD_Array;

public class SumOfElements {
	public static void main(String[] args) {
		int[][] arr= {{5,6,7,8},{6,8,4},{2,5}};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
		}
		System.out.println("Sum of element is "+sum);
	}
}

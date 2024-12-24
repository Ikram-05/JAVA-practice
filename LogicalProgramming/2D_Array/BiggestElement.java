//Program for find the biggest element in the 2D array

package TwoD_Array;
public class BiggestElement {
	public static void main(String[] args) {
		int[][] arr= {{9,6,5,4},{13,12,8},{3,18}};
		int max=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>=max) {
					max=arr[i][j];
				}
			}
		}
		System.out.println("Biggest element of the array is "+max);
	}
}

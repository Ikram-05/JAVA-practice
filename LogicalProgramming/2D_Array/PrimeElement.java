//program for print the prime element in 2D array

package TwoD_Array;

public class PrimeElement {
	static boolean isPrime(int n) {
		if(n<=1)
			return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[][] arr= {{12,11,14},{4,5,3},{9,7,21}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(isPrime(arr[i][j]))
					System.out.println(arr[i][j]);
			}
		}
	}
}

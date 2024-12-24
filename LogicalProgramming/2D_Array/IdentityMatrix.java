//Program for check the 2d array is matrix or not

package TwoD_Array;

public class IdentityMatrix {
	public static void main(String[] args) {
		int[][] arr= {{1,0,0},{0,1,0},{0,0,1}};
		boolean flag=true;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j&&arr[i][j]!=1) {
					flag=false;
					break;
				}
				else if(i!=j&&arr[i][j]!=0) {
					flag =false;
					break;
				}
			}
		}
		if(flag)
			System.out.println("Identity Matrix");
		else
			System.out.println("Not a identity matrix ");
	}
}

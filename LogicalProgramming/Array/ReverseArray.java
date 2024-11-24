//Program to reverse an Array

public class ReverseArray {
    
    static int[] reverse(int arr[]){
        int n=arr.length;
        int[] rev=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            rev[i]=arr[j];
            j++;
        }
        return rev;

    }

    public static void main(String[] args) {
        int[] arr={6,7,5,4,3,2};
        int[] rev=reverse(arr);
        for(int i=0;i<rev.length;i++){
            System.out.print(rev[i]+" ");
        }
    }
}

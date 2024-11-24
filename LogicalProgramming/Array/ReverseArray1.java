//Program for reverse an Array 

public class ReverseArray1 {
    static int[] reverse(int[] arr){
        int end=arr.length-1;
        int start=0;
        while(start<end){
            int temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
        return arr;    
    }
    public static void main(String[] args) {
        int[] arr={6,7,5,4,3,2};
        int[] rev=reverse(arr);
        for(int i=0;i<rev.length;i++){
            System.out.print(rev[i]+" ");
        }
    }
}

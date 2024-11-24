//Program to find a maximum value in a array

public class MaxElement {
    static int max(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max)
                max=arr[i];
        }        
        return max;
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10,7};
        System.out.println(max(arr));
    }        
}

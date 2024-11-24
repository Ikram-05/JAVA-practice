//Progarm to print smallest element in the array

public class SmallestElement {
    
    static int small(int[] arr){
        int small=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=small)
                small=arr[i];
        }
        return small;
    }
    public static void main(String[] args) {
        int[] arr={8,6,1,4,10};
        System.out.println(small(arr));
    }
}

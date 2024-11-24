//Program for find second smallest element

public class SecondSmallest {
    
    static int secondSmall(int[] arr){
        int small=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=small)
                small=arr[i];
        }
        int second_small=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=second_small&&arr[i]!=small)
                second_small=arr[i];
        }
        return second_small;
    }
    public static void main(String[] args) {
        int[] arr={1,5,6,4,3,8,9};
        System.out.println(secondSmall(arr));
    }
}

//program for find the largest and smallest element from the Array

public class SmallestAndLargest {
    public static void main(String[] args) {
        int[] arr={5,6,8,4,1,9,0};
        int min=arr[0];
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=min)
                min=arr[i];
            if(arr[i]>=max)
                max=arr[i];
        }
        System.out.println("Largest values is "+max);
        System.out.println("Smallest values is "+min);
    }
}

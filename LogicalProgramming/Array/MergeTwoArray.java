//program to merge a two array into single array

import java.util.Arrays;

public class MergeTwoArray {
    static int[] mergeArray(int[] arr1,int[] arr2){
        int size=arr1.length+arr2.length;
        int[] merge=new int[size];
        for(int i=0;i<arr1.length;i++){
            merge[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            merge[i+arr1.length]=arr2[i];
        }
        Arrays.sort(merge);
        return merge;
    }
    static int[] mergeArray2(int[] arr,int arr2[]){
        int[] merge=new int[arr.length+arr2.length];
        int index=0;
        for(int value:arr){
            merge[index++]=value;
        }
        for(int value:arr2){
            merge[index++]=value;
        }
        return merge;
    }
    public static void main(String[] args) {
        int[] a={1,3,5,7,9};
        int[] b={2,4,6,8};
        int[] res=mergeArray2(a, b);
        System.out.println(Arrays.toString(res));
    }
}

//Program for print the sum of elemenst presnt in the odd index value

public class sumOfOddIndexElements {
    static int sumOfOddIndex(int[] arr){
        int sum=0;
        for(int i=1;i<arr.length;i+=2){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(sumOfOddIndex(arr));
    }
}

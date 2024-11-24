//Program for adding elements in the array

public class SumOfArray {
    
    static int sumOfElements(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int[] arr={9,7,5,3,1,6};
        System.out.println(sumOfElements(arr));
        
    }
}

//Program for print the sum of even element in Array

class SumOfEvenElements{
    static int sumOfEven(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,4};
        System.out.println(sumOfEven(arr));
    }
}

class Problem1{
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++){
            sum+=i;
        }
        System.out.println("Total sum "+sum);
        sum=0;
        for(int i=1;i<=10;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("Odd sum"+sum);
        sum=0;
        for(int i=1;i<=10;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Even sum"+sum);
    }
}
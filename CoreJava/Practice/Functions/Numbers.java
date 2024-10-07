class Numbers
{
   public static void printnumber(int n){
    System.out.print(n+" ");
    if(n<10){
        printnumber(++n);

    }
   }
   
    public static void main(String[] args){
        System.out.println("Main method is started");
        printnumber(1);
        System.out.println("\nMain method is Ended");

    }
}
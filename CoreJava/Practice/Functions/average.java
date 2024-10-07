class average
{
    public static void main(String[] args) {
        System.out.println("Main method is started");
        sum(5,7,5);
        System.out.println("Main method is Ended");
    }

    public static void sum(int x,int y,int z)
    {
        int sum =x+y+z;
        float avr=sum/3.0f;
        System.out.println("The sum is "+sum +"\nThe average is " +avr);
    }
}
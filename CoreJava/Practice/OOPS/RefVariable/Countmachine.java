class Countmachine
{
    int count;
    void incrementCount(){
        System.out.println("Incrementing the count by 1");
        count++;
    }
    void Decrement(){
        System.out.println("Decrementing count by 1");
        count--;
    }
}
class Mainclass8
{
    public static void main(String[]args)
    {
        Countmachine c1=new Countmachine();
        System.out.println("current count of first machine  "+c1.count);
        c1.incrementCount();
        c1.incrementCount();
        c1.incrementCount();
        c1.incrementCount();
        c1.incrementCount();
        System.out.println("current count of first machine  "+c1.count);
        c1.Decrement();
        System.out.println("current count of first machine  "+c1.count);
        
        Countmachine c2=new Countmachine();
        System.out.println("Current count of second machine  "+c2.count);
    }

}
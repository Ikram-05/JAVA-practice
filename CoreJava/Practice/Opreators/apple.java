class apple
{
    public static void main(String[] args)
    {
        float amt=325;
        float qnt=0.852f;
        float price=amt*qnt;
        float gst=price*0.10f;
        float total=price+gst;
        System.out.println("The price of apple is "+price+"\nThe total bill is "+total);


    }
}
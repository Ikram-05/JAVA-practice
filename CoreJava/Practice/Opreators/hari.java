class hari
{
    public static void main(String[] args)
    {
        
        float cost=135;
        int no_of_dosa=6;
        float total=cost*no_of_dosa;
        float gst=total*0.18f;
        float bill=total+gst;
        System.out.println("Total amt is "+total+"\nGST is "+gst+"\nThe total bill is "+bill );
        }
}
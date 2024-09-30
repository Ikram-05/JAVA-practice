class gst{
    public static void main(String[] args) {
        System.out.println("main function is started");
        selling_price(25000);
        System.out.println("main function is ended");
    }

    public static void selling_price(float price)
    {
        float gst=price*0.18f;
        float selling_price=price+gst;
        System.out.println("Product price "+price);
        System.out.println("Product price after gst "+selling_price);
    }
}
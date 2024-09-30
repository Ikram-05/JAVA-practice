class mart
{
    public static void main(String[] args) {
        float p1=1299;
        float p2=149;
        float p3=349;
        float p4=199;
        float discount=0;
        float price=p1+p2+p3+p4;
        discount=price*10/100.0f;
        if(price>=2000)
        {
            discount=price*20/100.0f;

        }
        float total=price-discount;
        System.out.println("The price is = "+price);
        System.out.println("the discount amount is = -"+discount);
        System.out.println("The Total bill is = "+total);

    }
}
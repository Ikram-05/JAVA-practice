class icecream
{
    public static void main(String[] args) {
        int flavuorcode=2;
        String flavour=null;
        float price=0;
        boolean topings=true;
        boolean dryfruits=true;
        if(flavuorcode==1)
        {
            flavour="Vannila";
            price=110;
        } 
        if(flavuorcode==2)
        {
            flavour="kiwi";
            price=125;
        }
        if(flavuorcode==3)
        {
            flavour="dragon";
            price=145;
        }
        if(topings=true)
        {
            price=price+15;
            System.out.println("Toppings is 15rs ");
        }
        if(dryfruits=true)
        {
            price=price+20;
            System.out.println("Dryfruit is 20rs");            
        }
        float gst=price*0.18f;
        float total=price+gst;
        System.out.println("Flavour = "+flavour);
        System.out.println("Price is = "+price );
        System.out.println("The total bill amt is "+total);
    }
}
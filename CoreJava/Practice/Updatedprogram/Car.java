class Car
{
    public static void main(String[] args) 
    {
        String model="Verna";
        float price=135000;
        int cc=1450;
        float tax=0;
        float insurance=0;
        System.out.println("Ex-showroom price of the car "+price);
        if(price<1000000)
        {
            tax=price*.18f;
            price=price+tax;
        }
        else if(price>=1000000 && price<2000000)
        {
            tax=price*.26f;
            price=price+tax;
        }
        else if(price>=2000000 && price<3000000)
        {
            tax=price*.32f;
            price=price+tax;
        }
        else
        {
            tax=price*.36f;
            price=price+tax;
        }
        System.err.println("The tax amount is "+tax);
        if(cc<1000)
        {
            insurance=2350*5;
            price=price+insurance;
        }
        else if(cc>=1000 && cc<2000)
        {
            insurance=5750*5;
            price=price+insurance;
        }
        else if(cc>=2000 && cc<3000)
        {
            insurance=6950*5;
            price=price+insurance;
        }
        else
        {
            insurance=7450*5;
            price=price+insurance;
        }
        System.out.println("The Insurance for 5years "+insurance);
        System.out.println("On road price of the car is "+price);
    }
}
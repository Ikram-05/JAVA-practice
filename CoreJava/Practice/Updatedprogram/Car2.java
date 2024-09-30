import java.util.Scanner;
class Car2
{
    public static float Car(String model,float price,int cc,float tax,float insurance)
    {
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
        return price;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the model name of the car ");
        String model=sc.next();
        System.out.print("Enter Price  of the car ");
        float price=sc.nextFloat();
        System.out.print("Enter the CC of the car ");
        int cc=sc.nextInt();
        float tax=0;
        float insurance=0;
        System.out.println("Ex-showroom price of the car "+price);
        price=Car(model, price, cc, tax, insurance);
        System.out.println("On-road price of the car is "+price);
        
    }
}
class Pen
{
    String brand;
    double price;
    String color;

    Pen(String arg1,double arg2,String arg3){
        brand=arg1;
        price=arg2;
        color=arg3;
    }
    void details(){
        System.out.println("Brand: "+brand+" Price: "+price+" Color: "+color);
    }
}

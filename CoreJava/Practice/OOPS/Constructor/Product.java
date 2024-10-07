class Product{
    final int prod_id;
    String prod_name;
    double prod_price;
    Product(int id,String name,double price)
    {
        prod_id=id;
        prod_name=name;
        prod_price=price;
    }
}
class Mainclass8{
    public static void main(String[] args) {
        Product p1=new Product(1001,"Toys", 250.0);
        Product p2=new Product(1002, "Car", 1230.00);
        System.out.println("1st product id= "+p1.prod_id);
        System.out.println("2nd product id= "+p2.prod_id);

    }
}
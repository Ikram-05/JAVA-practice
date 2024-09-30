class Product2{
    static int random=1001;
    final int prod_id;
    String prod_name;
    double prod_price;

    Product2(String name,double price){
        prod_id=random++;
        prod_name=name;
        prod_price=price;
    }
    void detaisl(){
        System.out.println("Product id "+prod_id );
        System.out.println("Product name "+prod_name );
        System.out.println("Product price "+prod_price );
    }
}

class Mainclass9{
    public static void main(String[] args) {
        Product2 p1=new Product2("Cars", 240.0);
        Product2 p2=new Product2("Toys",123.00);
        p1.detaisl();
        p2.detaisl();
    }
}
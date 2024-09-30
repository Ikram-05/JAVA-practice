class Pen
{
    String brand;
    String color;
    double price;
}
class Mainclasspen{
    public static void main(String[] args) {
        Pen p1=new Pen();
        System.out.println(p1.brand);
        System.out.println(p1.color);
        System.out.println(p1.price);
        p1.brand="Cello";
        p1.color="Black";
        p1.price=25.00;
        System.out.println("\n"+p1.brand);
        System.out.println(p1.color);
        System.out.println(p1.price);

    }
}
class Notebook
{
    String size;
    String type;
    String brand;
    int pages;
    double price;
}
class Mainclass6
{
    public static void main(String[] args) {
        Notebook n1=new Notebook();
        System.out.println(n1.brand);
        System.out.println(n1.type);
        System.out.println(n1.size);
        System.out.println(n1.pages);
        System.out.println(n1.price);
        n1.brand="Class Mate";
        n1.type="Unruled";
        n1.size="King Size";
        n1.pages=200;
        n1.price=58.00;
        System.out.println("\n"+n1.brand);
        System.out.println(n1.type);
        System.out.println(n1.size);
        System.out.println(n1.pages);
        System.out.println(n1.price);
    }
}
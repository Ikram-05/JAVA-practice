class Beer
{
    String type;
    int cap;
    String brand;
    double perc;
    double price;
}

class Main3{
    public static void main(String[] args) {
        Beer b1=new Beer();
        b1.type="Strong";
        b1.cap=750;
        b1.brand="King Fisher";
        b1.perc=7.0;
        b1.price=210;
        System.out.println(b1.type+"\n"+b1.brand+"\n"+b1.cap+"\n"+b1.perc+"\n"+b1.price);
    }
}
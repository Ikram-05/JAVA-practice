class Demo2{
    int x=10;
    int y=20;
    void test(){
        System.out.println("Running test() method");
    }
}
class MainClass2{
    public static void main(String[] args) {
        System.out.println("Main method Starded");
        Demo2 d1=new Demo2();
        Demo2 d2=new Demo2();
        System.out.println("Modifying x and y values in d1");
        d1.x=100;
        d1.y=200;
        System.out.println("Printing modifiyed d1");
        System.out.println("value of X"+d1.x);
        System.out.println("value of y"+d1.y);
        System.out.println("Printing modifiyed d2");
        System.out.println("value of X"+d2.x);
        System.out.println("value of Y"+d2.y);
        System.out.println("Main method Starded");
    }
}
class Demo3{
    int x=10;
    int y=20;
    void test(){
        System.out.println("Running test() method");
    }
}
class MainClass3
{
    public static void main(String[] args) {
        System.out.println("Main method Started");
        Demo3 d1=new Demo3();
        Demo3 d2=d1;
        System.out.println("D1--------"+d1);
        System.out.println("D2-------"+d2);
        d1.x=100;
        d1.y=200;
        System.out.println("Printing X and Y after modify");
        System.out.println(d2.x);
        System.out.println(d2.y);
        System.out.println("Main method Ended");
    }
}
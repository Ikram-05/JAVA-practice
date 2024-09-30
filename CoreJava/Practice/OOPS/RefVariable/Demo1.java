class Demo1{
    int x=10;
    int y=20;
    void test(){
        System.out.println("Running test() method");
    }
}
class MainClass{
    public static void main(String[]args){
        System.out.println("Main method Started");
        Demo1 d1;
        d1=new Demo1();
        System.out.println("d1-------"+d1);
        Demo1 d2;
        d2=new Demo1();
        System.out.println();
        System.out.println("d2-------"+d2);
        System.out.println("Main method Ended");
    }
}
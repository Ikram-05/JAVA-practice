class Demo1
{
    int x;
    int y;

    Demo1(){
        System.out.println("Running Constructor body");
        x=100;
        y=200;
    }

}
class Mainclass1
{
    public static void main(String[]args){
        Demo1 d1=new Demo1();
        System.out.println("x value is "+d1.x);
        System.out.println("y value is "+d1.y);
        Demo1 d2=new Demo1();
        System.out.println("x value is "+d2.x);
        System.out.println("y value is "+d2.y);
        

    }
}

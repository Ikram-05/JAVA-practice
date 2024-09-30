class Demo2
{
    int x;
    int y;

    Demo2(int arg1,int arg2){
        x=arg1;
        y=arg2;
    }
}
class Mainclass2
{
    public static void main(String[] args) {
        Demo2 d1=new Demo2(20,15 );
        System.out.println(d1.x);
        System.out.println(d1.y);
        Demo2 d2=new Demo2(23,76);
        System.out.println(d2.x);
        System.out.println(d2.y);
        
    }
}
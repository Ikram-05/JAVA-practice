class Demo4
{
    int p=25;
    int q=30;
}
class MainClass4
{
    public static void main(String[] args) {
        Demo4 d1=new Demo4();
        d1.p=50;
        d1.q=60;
        //Re-initialization of refrenece Variable.........!!!!!!
        d1=new Demo4();
        System.out.println(d1.p);
        System.out.println(d1.q);
    }
}
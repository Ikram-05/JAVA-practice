class sample2
{
    int x=100;
    void display(){
        int x=200;
        System.out.println("Local variable x value is "+x);
        System.out.println("Non-static variable x value is "+this.x);
    }
}
class Mainclass5{
    public static void main(String []args){
        sample2 s2=new sample2();
        s2.display();
    }
}
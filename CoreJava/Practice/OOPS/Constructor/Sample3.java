class Sample3{
    int x;
    double y;

    Sample3(int x){
        System.out.println("Constructor 1....!!");
        this.x=x;
        System.out.println(this.x);
    }
    Sample3(double y){
        System.out.println("Constructor 2....!!");
        this.y=y;
        System.out.println(this.y);
        
    }
    Sample3(int x,double y){
        System.out.println("Constructor 3....!!");
        this.x=x;
        this.y=y;
        System.out.println(this.x);
        System.out.println(this.y);

    }
    Sample3(double y,int x){
        System.out.println("Constructor 4....!!");
        this.y=y;
        this.x=x;
        System.out.println(this.y);
        System.out.println(this.x);

    }
}
class Mainclass7{
    public static void main(String[]args){
        Sample3 s3=new Sample3(10);
        Sample3 s4=new Sample3(11.0);
        Sample3 s5=new Sample3(10,23.4);
        Sample3 s6=new Sample3(23.4,10);

    }
}
class Sample{
    int x,y;
    Sample(){
        int x=100;
        int y=200;
    }
}
class Mainclass5{
    public static void main(String[] args) {
    Sample s1=new Sample();
    System.out.println(s1.x);
    System.out.println(s1.y);

}
}
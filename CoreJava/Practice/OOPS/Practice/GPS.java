class GPS
{
    double longitude;
    double latitude;

    void show(){
        System.out.println("("+longitude+","+latitude+")");
    }
}
class Main2
{
    public static void main(String[] args) {
        GPS g1=new GPS();
        g1.longitude=387.464;
        g1.latitude=31517.34;
        g1.show();
    }
}
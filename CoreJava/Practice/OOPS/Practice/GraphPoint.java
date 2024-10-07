class GraphPoint
{
    double x_axis;
    double y_axis;

    void displayCoOrdinates()
    {
        System.out.println("("+x_axis+","+y_axis+")");
    }
}
class Mainclass1
{
    public static void main(String[] args) {
        System.out.println("main method started");
        GraphPoint p1=new GraphPoint();
        p1.x_axis=5.6;
        p1.y_axis=7.7;
        p1.displayCoOrdinates();
        System.out.println("----------------------------------");
        GraphPoint p2=new GraphPoint();
        p2.x_axis=2.4;
        p2.y_axis=5.7;
        p2.displayCoOrdinates();
        System.out.println("main method Ended");

    }
}
class Question11
{
    public static double cylinder(int r,int h){
        double res=3.14*r*r*h;
        return res;

    }
    public static void main(String[] args) {
        double result=cylinder(7, 5);
        System.out.println("The volume of the Cylinder = "+result);
    }
}
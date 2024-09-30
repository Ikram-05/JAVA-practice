class Question10
{
    public static double cone(int r,int h){
        double volume=3.14*r*r*(h/3.0f);
        return volume;

    }
    public static void main(String[] args) {
        int a=6;
        int b=9;
        double result=cone(a, b);
        System.out.println("The volume of the cone = "+result);
    }
}
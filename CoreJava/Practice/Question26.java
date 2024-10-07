class Question26
{
    public static float Trapezoid(int a,int b)
    {
        float total=1/2.0f*(a+b);
        return total;
    }
    public static void main(String[] args) {
        int side_a=8;
        int side_b=9;
        float area=Trapezoid(side_a, side_b);
        System.out.println("The area of Trapezoid is "+area);
    }
}
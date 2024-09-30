class Question12
{
    public static float Rhombus(int d1,int d2)
    {
        float area=1.0f/2*d1*d2;
        return area;
    }
    public static void main(String[] args) {
        float area =Rhombus(7,8);
        System.out.println("The area of Rhombus is = "+area);
        
    }
}
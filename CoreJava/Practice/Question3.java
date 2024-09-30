class Question3
{
    public static float triangle(float length,float breath)
    {
        float result=1/2.0f*length*breath;
        return result;
    }

    public static void main(String[] args)
    {
        
        float area=triangle(12,7);
        System.out.println("The area of triangle is = "+area);
    }
}
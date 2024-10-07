class Question2
{
    public static float circle(float r)
    {
        float pi=22/7.0f;
        float area=pi*r*r;
        return area;
    } 
    public static void main(String[] args) {
        float r=12;
        float area=circle(r);
        System.out.println("The area of the circle is = "+area);
        
    }
}
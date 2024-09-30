class Question15
{
    public static float circle(int r)
    {
        float perimeter=2*3.14f*r;
        return perimeter;
    } 
    public static void main(String[] args) {
        int a=6;
        float result=circle(a);
        System.out.println("The Perimeter of the circle is = "+result);
        
    }
}
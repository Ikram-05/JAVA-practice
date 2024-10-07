class Question16
{
    public static float Semi_circle(int r)
    {
        float result=r*(3.14f+2);
        return result;
    } 
    public static void main(String[] args) {
        float perimeter=Semi_circle(9);
        System.out.println("The Perimeter of the Semi-circle is = "+perimeter);
        
    }
}
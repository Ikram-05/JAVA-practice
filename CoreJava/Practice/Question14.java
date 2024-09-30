class Question14{

    public static double Semi_circle(float r)
    {
        double result=1/2.0f*3.14*r*r;
        return result;
    } 
    public static void main(String[] args) {
        float r=6;
        double area=Semi_circle(r);
        System.out.println("The area of the SemiCircle is = "+area);
        
    }
}
class Question8
{
    public static float sphere(int r)
    {
        float area=4*3.14f*r*r;
        return area;
    }
    public static void main(String[] args) {
        int r=8;
        float result=sphere(r);
        System.out.println("The area of sphere is = "+result);
    }
}
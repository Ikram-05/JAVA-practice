class Question9
{
    public static double cone(float r,int h){
        double result=3.14f*r*(r+Math.sqrt(h*h+r*r));
        return result;

    }
    public static void main(String[] args) {
        float r=8;
        int h=12;
        double area=cone(r,h);
        System.out.println("The surface area of cone is = "+area);
    }
}
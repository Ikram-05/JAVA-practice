class Question13
{
    public static double Pentagon(int s,int a){
        double res=5/2.0f*s*a;
        return res;

    }
    public static void main(String[] args) {
        int a=8;
        int b=5;
        double areaOfPentagon=Pentagon(a,b);
        System.out.println("The volume of the Pentagon = "+areaOfPentagon);
    }
}
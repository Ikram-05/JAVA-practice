class Question7
{
    public static int Parallelogram(int breath,int height)
    {
        int result=breath*height;
        return result;
    }
    public static void main(String[] args) {
        int b=8;
        int h=4;
        int area =Parallelogram(b,h);
        System.out.println("The area of Parallelogram is = "+area);
        
    }
}
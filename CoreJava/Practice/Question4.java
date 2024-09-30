class Question4
{
    public static int rectangle(int l,int b)
    {
        int result=l*b;
        return result;
    }
    public static void main(String[] args) {
        int length=6;
        int breath=5;
        int area =rectangle(length, breath);
        System.out.println("The area of rectangle is = "+area);
        
    }
}
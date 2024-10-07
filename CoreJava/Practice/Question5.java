class Question5
{
    public static int square(int a)
    {
        int result=a*a;
        return result;
    }
    public static void main(String[] args) {
        int length=8;
        int area=square(length);
        System.out.println("The area of Square is = "+area);
    }
}
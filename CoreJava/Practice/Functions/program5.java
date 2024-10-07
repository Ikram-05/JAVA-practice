class program5
{
    public static void findSquare(int n)
    {
        int res = n*n;
        System.out.println("Square of the "+n+ " is " +res);
    }
    
    public static void main(String[] args) {
        System.out.println("main methos is Stared");
        findSquare(13);
        findSquare(9);
        System.out.println("main methos is ended");

    }
}
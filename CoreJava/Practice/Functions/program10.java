class program10
{
    public static int findsquare(int n){
        return n*n;
    }
    public static void main(String[] args) {
        System.out.println("Main method started");
        int a=5;
        int b=6;
        int res=findsquare(a)+2*a*b+findsquare(b);
        System.out.println(res);
        
        System.out.println("Main method ended");
    }
}
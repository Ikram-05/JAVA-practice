class Question20{
    public static int square(int m){
        int square=m*m;
        return square;
    }

    public static int cube(int m)
    {
        int cube=m*m*m;
        return cube;
    }
    public static void main(String[] args) {
        int m=8;
        int square=square(m);
        int cube=cube(m);
        System.out.println("The Square of the "+m+" is "+square+"\nThe Cube of the "+m+" is "+cube);
        
    }
}
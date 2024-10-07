class Question17
{
    public static int Surface_cube(int a){
        return 6*a*a;

    }
    
    public static void main(String[] args) {
        int side=7;
        int surface_area=Surface_cube(side);
        System.out.println("The surface area of cube is = "+surface_area);
    }
}
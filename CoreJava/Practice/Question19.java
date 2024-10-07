class Question19
{
    public static float Hemi_sphere(int r){
        float result=3*3.14f*r*r;
        return result;
    }
    public static void main(String[] args) {
        float area=Hemi_sphere(12);
        System.out.println("The Surface area of Hemi-Sphere is = "+area);
    }
}
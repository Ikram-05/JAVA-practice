class Question18{
    public static int Cuboid(int l,int w,int h){
        int area =2*(l*w+w*h+l*h);
        return area;
    }
    public static void main(String[] args) {
        int length=7;
        int width=5;
        int height=9;
        int result=Cuboid(length, width, height);
        System.out.println("The Surface area of cuboid is = "+result);
    }
}
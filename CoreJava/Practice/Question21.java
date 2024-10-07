class Question21
{
    public static float circle(int r){
        float result=2*3.14f*r;
        return result;
    }
    public static void main(String[] args) {
        int rad=5;
        float circumfrence=circle(rad);
        System.out.println("The Circumfrence of circle is = "+circumfrence);
        
    }
}
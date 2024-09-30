class circle{
    public static void main(String[] args) {
        System.out.println("Main method is started");
        int r=12;
        area(r);
        diameter(r);
        circum(r);
        System.out.println("Main method is Ended");
    }

    public static void diameter(float r)
    {
        float meter=2*r;
        System.out.println("Diameter of the circle is " + meter);
    }

    public static void area(float r)
    {
        float pi=3.14f;
        float a=pi*r*r;
        System.out.println("Area of the circle is "+a);
    }

    public static void circum(float r)
    {
        float pi=3.14f;
        float c=2*pi*r;
        System.out.println("Circumference of the circle is "+c);
    }
}

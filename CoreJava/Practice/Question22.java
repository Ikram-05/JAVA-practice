class Question22{
    public static float KM_to_miles(int km)
    {
        float mile=0.621f*km;
        return mile;
    }
    public static void main(String[] args) {
        int km=20;
        float mile=KM_to_miles(km);
        System.out.println("The "+km+" is equal to "+mile+" miles." );
    }
}
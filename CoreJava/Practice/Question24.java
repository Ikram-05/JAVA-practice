class Question24{
    public static float SI(float p,int n,float r)
    {
        float simple_interest=(p*n*r/100);
        return simple_interest;

    }
    public static void main(String[] args) {
        float principle=15000f;
        int time=12;
        float rate=.30f;
        float si=SI(principle, time, rate);
        System.out.println("The simple interest for "+principle+" for "+time +" months is "+si);

        
    }
}
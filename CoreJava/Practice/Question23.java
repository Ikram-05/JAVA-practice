class Question23
{
    public static float KG_lb(float kg)
    {
        float lb=2.205f*kg;
        return lb;
    }
    public static void main(String[] args) {
        float kg=5.7f;
        float lb=KG_lb(kg);
        System.out.println(kg+" is equal to "+lb);
    }
}
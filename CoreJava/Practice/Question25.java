class Question25{
    public static float Precentage(int p,int m,int c,int o)
    {
        int total=p+m+c+o;
        float perc=total/320f*100;
        return perc;
    }
    public static void main(String[] args) {
        int phy=56;
        int mat=45;
        int chem=63;
        int opt=64;
        float percentage=Precentage(phy, mat, chem, opt);
        System.out.println("The total percentage is "+percentage);
    }
}
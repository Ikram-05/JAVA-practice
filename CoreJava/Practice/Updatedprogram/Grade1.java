class Grade1
{
    public static void main(String[] args) {
        int p=56;
        int c=43;
        int m=56;
        int o=45;
        int total=p+m+c+o;
        float perc=total/400.0f*100;
        System.out.println("The percantge is = "+perc);
        if(perc<35){
            System.out.println("fail");
        }
        else if(perc>=35&&perc<60)
        {
                System.out.println("Second class");
        }
        else if (perc>=60&&perc<80)
        {
                System.out.println("First class");
        }
        else
        {
            System.out.println("Destinction class");
        }
    }
}
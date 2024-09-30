class Lenskart
{
    public static void main(String[] args) {
        int qcode=4;
        int scode=3;
        float perc=71;
        int yop=2024;
        if((qcode==1||qcode==2||qcode==4)&&(scode>=1&&scode<=4) &&(perc>=55)&& (yop==2023||yop==2024)){
            System.out.println("Eligible for interview");
        }
        else{
            System.out.println("Not-Eligible for interview");
            if(qcode!=1&&qcode!=2&&qcode!=4){
                System.out.println("Qualification is not matching ");
            }
            if(scode<1||scode>4)
            {
                System.out.println("Stream is not matching");
            }
            if(perc<55)
            {
                System.out.println("Percentage is not matching");
            }
            if(yop!=2023&&yop!=2024)
            {
                System.out.println("YOP is not matching ");
            }
        }
        
    }
}
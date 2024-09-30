class ExamAlter
{
    public static void main(String[]args)
    {
        int phy=65;
        int chem=58;
        int math=61;
        int opt=48;
        if(phy<28||chem<28||math<28||opt<28){
            System.out.println("Fail");
            if(phy<28)
            {
                System.out.println("Failed in Physics "+phy);
            }
            if(chem<28)
            {
                System.out.println("Failed in Chemistry "+chem);
            }
            if(math<28)
            {
                System.out.println("Failed in Maths "+math);
            }
            if(opt<28)
            {
                System.out.println("Failed in Optinal "+opt);
            }

        }
        else{
            System.out.println("Pass");
            int total=phy+chem+math+opt;
            float perc=total/280.f*100;
            System.out.println("The precentage is "+perc);
        }
    }
}

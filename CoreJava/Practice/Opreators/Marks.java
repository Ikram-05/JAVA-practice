class Marks{
    public static void main(String[] args) {
        int phy=65;
        int chem=48;
        int math=45;
        int opt=52;
        int total_marks=phy+chem+math+opt;
        float prec=total_marks/280.0f*100;
        System.out.println("The total mark of suresh is "+total_marks);
        System.out.println("The precentange is "+prec);
    }
}
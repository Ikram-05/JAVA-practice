class SI
{
    public static void simple_interest()
    {
        double amt=25000;
        double rate=0.80;
        int time=12;
        double interest=(amt*rate*time)/100;
        System.out.println(interest);

    } 

    public static void main(String[] args) {
        System.out.println("main method is started");
        simple_interest();
        System.out.println("main method is ended");

    }
}
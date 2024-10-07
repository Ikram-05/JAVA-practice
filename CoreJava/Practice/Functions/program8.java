class program8
{
    public static int test(){
        System.out.println("Running test() method...");
        return 100;
    }
    public static void main(String[] args) {
        test();
        System.out.println(test());
        int res=test();
        System.out.println(res);
        System.out.println("Main method is Ended");

    }
}
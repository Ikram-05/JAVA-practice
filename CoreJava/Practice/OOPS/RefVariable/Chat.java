class Chat
{
    String sender;
    long number;
    String date;
    boolean status;
    String msg;
}
class Mainclass7
{
    public static void main(String[] args) {
        Chat c1=new Chat();
        System.out.println(c1.sender);
        System.out.println(c1.number);
        System.out.println(c1.date);
        System.out.println(c1.status);
        System.out.println(c1.msg);
        c1.sender="Aishu";
        c1.number=7510510658l;
        c1.date="12.06.2024";
        c1.msg="Hey How are you...!!";
        c1.status=true;
        System.out.println("\n"+c1.sender);
        System.out.println(c1.number);
        System.out.println(c1.date);
        if(c1.status==true){
            System.out.println("Online");
        }
        else{
            System.out.println("Offline");
        }
        System.out.println(c1.msg);
    }
}
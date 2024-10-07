class Atm
{
    String customer_name;
    long card_num;
    int cvv;
    String expiry_date;
    int pin;

    Atm(String name,long num,int cvv,String date,int pin){
        customer_name=name;
        card_num=num;
        this.cvv=cvv;
        expiry_date=date;
        this.pin=pin;
    } 
    void details(){
        System.out.println(customer_name+card_num+cvv+expiry_date+pin);
    }
}
class Mainclass6{
    public static void main(String[] args) {
        Atm a1=new Atm("Ikram", 42899282, 102, "06/01/2003",4558 );
        a1.details();
    }

}
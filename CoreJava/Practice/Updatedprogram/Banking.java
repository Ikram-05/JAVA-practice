class Banking
{
    public static void main(String[] args) {
        float balance=75000;
        float amt=25000;
        boolean pan=false;
        System.out.println("The balance amount before deposit "+balance);
        System.out.println("Amount for deposit "+amt);
        if(amt<100000||pan==true)
        {
            balance=balance+amt;
        }
        else
        {
            System.out.println("Link PanCard ");
        }
        System.out.println("The balance after deposit "+balance);
    }
}
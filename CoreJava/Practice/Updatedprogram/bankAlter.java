class bankAlter
{
    public static void main(String[] args) {
        float balance=75000;
        float amt=225000;
        boolean pan=false;
        System.out.println("Balance before deposit "+balance);
        System.out.println("Deposit amount "+amt);
        if(amt>=100000)
        {
            if(pan==true)
            {
                balance=balance+amt;
            }
            else
            {
                System.out.println("Link pancard");
            }
        }
        else 
        {
            balance=balance+amt;
        }
        System.out.println("Balance after deposit "+balance);
    }
}
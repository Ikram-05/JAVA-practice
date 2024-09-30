class Test1
{
    public static void main(String[] args) {
        float balance=75000;
        float amt=25000;
        int bank_code=3;
        boolean pancard=true;
        if(amt<balance)
        {
            if(pancard==true||amt<50000)
            {
                balance=balance-amt;
                System.out.println("Transcation Succeful");
                if(bank_code==1&&balance<100000)
                {
                    System.out.println("Low minimum balance");
                    System.out.println(balance-amt+" Deposit amount to maintain balance");
                }
                else if((bank_code==2||bank_code==3)&&(balance<5000))
                {
                    System.out.println("Low minimum balance");
                    System.out.println(balance-amt+" Deposit amount to maintain balance");
                }
            }
            else
            {
                System.out.println("Link pancard");
            }
            System.out.println("Balance after deposit "+balance);
        }
        else
        {
            System.out.println("Insuffient Balance");
        }
    }
}
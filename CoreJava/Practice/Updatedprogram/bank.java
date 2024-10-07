class bank
{
    public static void main(String[]args)
    {
        float balance=75000;
        float amt=25000;
        System.out.println("Current blanace = "+balance);
        System.out.println("Deposit amount = "+amt);
        balance=balance+amt;
        System.out.println("Balance after deposit = "+balance);
    }
}
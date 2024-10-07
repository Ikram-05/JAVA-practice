import java.util.Scanner;
class Test2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float balance=75000;
        System.out.print("Enter the withdraw amt ");
        float amt=sc.nextFloat();
        System.out.print("Enter the bankcode ");
        int bank_code=sc.nextInt();
        System.out.print("Pancard ");
        boolean pancard=sc.nextBoolean();
        if(amt<balance)
        {
            if(pancard==true||amt<50000)
            {
                balance=balance-amt;
                System.out.println("Transcation Succeful");
                if(bank_code==1&&balance<100000)
                {
                    System.out.println("Low minimum balance");
                    System.out.println(10000-balance+" Deposit amount to maintain balance");
                }
                else if((bank_code==2||bank_code==3)&&(balance<5000))
                {
                    System.out.println("Low minimum balance");
                    System.out.println(5000-balance+" Deposit amount to maintain balance");
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
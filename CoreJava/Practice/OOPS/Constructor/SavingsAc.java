import java.util.Scanner;
class SavingsAc{
    static String ifsc;
    static String branch;
    long ac_no;
    String name;
    double balance;

    SavingsAc(long ac_no,String name,double balance){
        ifsc="SBIN0043";
        branch="Main";
        this.ac_no=ac_no;
        this.name=name;
        this.balance=balance;
    }
    void disp(){
        System.out.println("Account holde name: "+name);
        System.out.println("Account No: "+ac_no);
        System.out.println("Balance: "+balance);
        System.out.println("IFSC code: "+ifsc);
        System.out.println("Branch name: "+branch);
    }
}
class Mainclass10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        long acno=sc.nextLong();
        double bal=sc.nextDouble();
        SavingsAc s1=new SavingsAc(acno, name, bal);
        s1.disp();
    }
}
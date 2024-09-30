import java.util.Scanner;
class Employee
{
    int id;
    String name;
    double salary;
    double expirence;

    Employee(int arg1,String arg2,double arg3,double arg4){
        System.out.println("Creating Employee instance");
        id=arg1;
        name=arg2;
        salary=arg3;
        expirence=arg4;
    }
    void details(){
        System.out.println("ID: "+id+"\nName: "+name+"\nSalary: "+salary+"\nExpirence: "+expirence);
    }
}
class Mainclass4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int eid;
        String ename;
        double esalary,eexperience;
        System.out.println("Enter Employee Id");
        eid=sc.nextInt();
        System.out.println("Enter Employee Name");
        ename=sc.next();
        System.out.println("Enter Employee Salary");
        esalary=sc.nextDouble();
        System.out.println("Enter Employee Expirence");
        eexperience=sc.nextDouble();
        Employee exp=new Employee(eid, ename, esalary, eexperience);
        exp.details();
    }

}
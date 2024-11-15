import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d1=sc.nextInt();
        int d2=sc.nextInt();
        int d3=sc.nextInt();
        if(d1==d2 && d1==d3 && d2==d3 && (d1+d2+d3)==180){
            System.out.println("Form a triangle");
        }
        else{
            System.out.println("It will not create");
        }
        sc.close();
    }
}

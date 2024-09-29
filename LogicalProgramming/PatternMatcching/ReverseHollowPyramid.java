//this program for print a hollow reverse pyramid

import java.util.Scanner;

public class ReverseHollowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num ");
        int num = sc.nextInt();
        for (int i = num; i>=1; i--) {
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            if (i == 1 || i == num) {
                for (int j = 1; j < 2 * i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j < 2 * i; j++) {
                    if (j == 1 || j == 2 * i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }

    // for (int i = num; i > 0; i--) {
    // for (int j = 1; j <= num - i; j++)
    // System.out.print(" ");
    // if (i == 1 || i == num)
    // for (int j = 1; j <= i * 2 - 1; j++)
    // System.out.print("*");
    // else
    // for (int j = 1; j <= i * 2 - 1; j++)
    // if (j == 1 || j == i * 2 - 1)
    // System.out.print("*");
    // else
    // System.out.print(" ");
    // System.out.println();
    // }
}

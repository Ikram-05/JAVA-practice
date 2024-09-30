import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read an integer input
        System.out.print("Enter an integer: ");
        int N = scanner.nextInt();

        // Print the first 10 multiples of N
        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }

        // Close the scanner
        scanner.close();
    }
}

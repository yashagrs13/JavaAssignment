import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci Sequence");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a positive Interger for the Fibonacci sequence ");
            return;
        }
        int[] fibonacci = new int[n];

        if (n >= 1) {
            fibonacci[0] = 0;
        }
        if (n >= 2) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("The first " + n + " terms of the Fibonacci sequence are : ");
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(fibonacci[i] + ".");
            } else {
                System.out.print(fibonacci[i] + ",");
            }
        }
    }
}
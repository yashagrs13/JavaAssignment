import java.util.Scanner;

public class PrimeNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter integer " + (i + 1) + " :");
            num[i] = sc.nextInt();
        }

        for (int number: num) {
            primeCheck(number);
        }
        sc.close();
    }
    static void primeCheck(int n) {
        int counter = 0;
        if (n <= 1) {
            counter = 2;

        }

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                counter++;
            }
        }

        if (counter <= 1) {
            System.out.println(n + ": is a Prime Number");
        } else {
            System.out.println(n + ": is not a Prime Number");
        }

    }

}
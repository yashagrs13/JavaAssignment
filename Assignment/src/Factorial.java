import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its Factorial : ");
        int num = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of the given number is : " + fact);
        sumOfFact(fact);

    }

    static void sumOfFact(int fact) {
        int sum = 0;
        while (fact > 0) {
            int remainder = fact % 10;
            sum = remainder + sum;
            fact = fact / 10;

        }
        System.out.println("The sum of the factorial is : " + sum);
    }
}
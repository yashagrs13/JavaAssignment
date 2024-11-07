import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2, result;

        do {
            System.out.println("\n----- Menu -----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = sc.nextInt();
            
            if (choice == 5) {
                System.out.println("Exiting the Calculator.");
                break;
            }

            System.out.println("Enter the First number : ");
            num1 = sc.nextDouble();
            System.out.println("Enter the Second number : ");
            num2 = sc.nextDouble();

            if (choice == 1) {
                result = num1 + num2;
                System.out.println(" Addition of : " + num1 + " and " + num2 + " is : " + result);
            } else if (choice == 2) {
                result = num1 - num2;
                System.out.println("Substraction of : " + num1 + " and " + num2 + " is : " + result);
            } else if (choice == 3) {
                result = num1 * num2;
                System.out.println("Multiplication of : " + num1 + " and " + num2 + " is : " + result);
            } else if (choice == 4) {
                if (num2 == 0) {
                    System.out.println("Division by 0 is not allowed");
                } else {
                    result = num1 / num2;
                    System.out.println("Division of : " + num1 + " and " + num2 + " is : " + result);
                }
            } else {
                System.out.println("Enter a Valid choice.");
            }
        }
        while (choice != 5);
        sc.close();
    }
}
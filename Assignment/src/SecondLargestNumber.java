import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Integers ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Cannot find the Second Largest number with only one input. ");
        }

        int[] numbers = new int[n];
        System.out.println("Enter the " + n + " Integers : ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        secondLargestFinder(numbers);
        sc.close();
    }

    static void secondLargestFinder(int[] numbers) {
        int largest = -1;
        int secondLargest = -1;

        for (int num: numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        if (secondLargest == -1) {
            System.out.println("There is no Second largest number as all numbers might be equal ");
        } else {
            System.out.println("The second Largest number is : " + secondLargest);
        }
    }
}
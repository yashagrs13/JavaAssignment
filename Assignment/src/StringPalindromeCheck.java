import java.util.Scanner;

public class StringPalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        isPalindrome(str);
        sc.close();
    }
    static void isPalindrome(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("The given String '" + str + "' is a Palindrome ");
        } else {
            System.out.println("The given String '" + str + "' is not a Palindrome ");
        }

    }
}
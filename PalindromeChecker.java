import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int A = num;
        int rev = 0;

        while (A != 0) {
            int digit = A % 10;
            rev = rev * 10 + digit;
            A /= 10;
        }

        if (rev == num) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }

        sc.close();
    }
}

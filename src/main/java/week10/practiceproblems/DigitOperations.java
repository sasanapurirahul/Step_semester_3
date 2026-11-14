import java.util.Scanner;

public class DigitOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int remaining = number;
        int sum = 0;
        int reversed = 0;

        while (remaining > 0) {
            int digit = remaining % 10;
            sum += digit;
            reversed = reversed * 10 + digit;
            remaining /= 10;
        }

        System.out.println("Sum of digits: " + sum);
        System.out.println("Reverse: " + reversed);

        scanner.close();
    }
}
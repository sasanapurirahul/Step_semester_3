import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            boolean isPrime = number > 1;

            for (int divisor = 2; divisor * divisor <= number; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number + " is prime");
            } else {
                System.out.println(number + " is not prime");
            }
        }

        scanner.close();
    }
}
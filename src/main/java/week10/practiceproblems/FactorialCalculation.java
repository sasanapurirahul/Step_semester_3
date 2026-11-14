import java.math.BigInteger;
import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            BigInteger factorial = BigInteger.ONE;

            for (int i = 1; i <= number; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }

            System.out.println(factorial);
        }

        scanner.close();
    }
}
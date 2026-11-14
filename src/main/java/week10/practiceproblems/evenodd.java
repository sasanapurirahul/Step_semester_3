import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int even = 0;
        int odd = 0;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        scanner.close();
    }
}
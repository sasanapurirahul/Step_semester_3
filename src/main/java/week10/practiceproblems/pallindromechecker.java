import java.util.Scanner;

public class pallindromechecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String word = scanner.next();
            String reversed = new StringBuilder(word).reverse().toString();

            if (word.equalsIgnoreCase(reversed)) {
                System.out.println(reversed + " - palindrome");
            } else {
                System.out.println(reversed + " - not a palindrome");
            }
        }

        scanner.close();
    }
}
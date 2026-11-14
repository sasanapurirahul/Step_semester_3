import java.util.Scanner;

public class counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int vowels = 0;
        int consonants = 0;

        for (char ch : word.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                vowels++;
            } else {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        scanner.close();
    }
}
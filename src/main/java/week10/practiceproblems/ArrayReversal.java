import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the numbers separated by spaces.
        String[] input = scanner.nextLine().replaceAll("[\\[\\],]", "").trim().split("\\s+");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }

        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }
}
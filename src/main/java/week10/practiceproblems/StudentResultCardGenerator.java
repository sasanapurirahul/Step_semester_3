import java.util.Scanner;

class Student {
    private final String name;
    private final int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double calculateAverage() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return (double) total / marks.length;
    }

    char calculateGrade(double average) {
        if (average >= 75) {
            return 'B';
        } else if (average >= 60) {
            return 'C';
        } else if (average >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }

    void printResult() {
        double average = calculateAverage();
        char grade = calculateGrade(average);

        System.out.printf("%s: Average %.1f, Grade %c%n",
                name.toUpperCase(), average, grade);
    }
}

public class StudentResultCardGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String name = scanner.next();
            int[] marks = {
                scanner.nextInt(),
                scanner.nextInt(),
                scanner.nextInt()
            };

            Student student = new Student(name, marks);
            student.printResult();
        }

        scanner.close();
    }
}
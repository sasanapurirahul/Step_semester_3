import java.util.*;

class ExaminationQuestionGrader {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        double totalScore = 0;

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();

            String[] parts = line.split("\"");

            String questionType = parts[0].trim().split(" ")[0];
            String correctAnswer = parts[3];
            String studentAnswer = parts[5];

            String[] first = parts[0].trim().split(" ");
            String[] last = parts[6].trim().split(" ");

            int points = Integer.parseInt(last[last.length - 1]);

            double score = 0;

            if (questionType.equals("MCQ")) {
                if (studentAnswer.equals(correctAnswer)) {
                    score = points;
                }
            }

            else if (questionType.equals("TF")) {
                if (studentAnswer.equals(correctAnswer)) {
                    score = points;
                }
            }

            else if (questionType.equals("ESSAY")) {
                String[] keywords = correctAnswer.split(",");
                int count = 0;

                String answer = studentAnswer.toLowerCase();

                for (String keyword : keywords) {
                    if (answer.contains(keyword.trim().toLowerCase())) {
                        count++;
                    }
                }

                if (count >= 2) {
                    score = points * 0.75;
                }
                else if (count == 1) {
                    score = points * 0.50;
                }
            }

            System.out.printf("%s: %.2f%n", questionType, score);
            totalScore += score;
        }

        System.out.printf("Total Score: %.2f%n", totalScore);

        sc.close();
    }
}

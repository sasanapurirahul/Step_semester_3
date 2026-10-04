class Scorecard {
    private boolean[] results;
    private int count;

    Scorecard(int totalQuestions) {
        results = new boolean[totalQuestions];
        count = 0;
    }

    void recordAnswer(boolean result) {
        if (count < results.length) {
            results[count] = result;
            count++;
        } else {
            System.out.println("No more answers can be recorded");
        }
    }

    int getScore() {
        int score = 0;

        for (int i = 0; i < count; i++) {
            if (results[i]) {
                score++;
            }
        }

        return score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scorecard sc = new Scorecard(4);

        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);

        System.out.println("Score = " + sc.getScore());
    }
}
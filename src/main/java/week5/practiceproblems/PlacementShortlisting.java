import java.util.Arrays;

class Candidate {
    private String name;
    private double cgpa;
    private int codingScore;

    public Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    static boolean isEligible(double cgpa) {
        return cgpa >= 7.5;
    }

    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }

    double compositeScore() {
        return cgpa * 10 + codingScore;
    }

    String getName() {
        return name;
    }
}

public class PlacementShortlisting {
    static String shortlistAndRank(Candidate[] candidates) {
        Candidate[] shortlisted = new Candidate[candidates.length];

        int count = 0;

        for (Candidate candidate : candidates) {
            if (Candidate.isEligible(candidate.cgpa)) {
                shortlisted[count] = candidate;
                count++;
            } else if (Candidate.isEligible(candidate.cgpa, candidate.codingScore)) {
                shortlisted[count] = candidate;
                count++;
            }
        }

        Candidate[] result = Arrays.copyOf(shortlisted, count);

        Arrays.sort(result, (a, b) ->
            Double.compare(b.compositeScore(), a.compositeScore())
        );

        String output = "";

        for (int i = 0; i < result.length; i++) {
            output += (i + 1) + ". "
                    + result[i].getName()
                    + " (" + result[i].compositeScore() + ")";

            if (i < result.length - 1) {
                output += " | ";
            }
        }

        return output;
    }

    public static void main(String[] args) {
        Candidate[] candidates = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };

        System.out.println(shortlistAndRank(candidates));
    }
}
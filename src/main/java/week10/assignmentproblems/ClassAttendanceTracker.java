public class ClassAttendanceTracker {

    public static int[] attendanceSummary(int[] days) {
        int presentDays = 0;
        int currentStreak = 0;
        int longestStreak = 0;

        for (int day : days) {
            if (day == 1) {
                presentDays++;
                currentStreak++;
                longestStreak = Math.max(longestStreak, currentStreak);
            } else {
                currentStreak = 0;
            }
        }

        return new int[]{presentDays, longestStreak};
    }

    public static void main(String[] args) {
        int[] days = {1, 1, 0, 1, 1, 1, 0, 1};
        int[] summary = attendanceSummary(days);

        System.out.println("Present: " + summary[0]
                + ", Longest streak: " + summary[1]);
    }
}
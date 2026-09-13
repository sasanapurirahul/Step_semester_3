class CourseDetails {
    String code;
    String title;
    int credits;
    int labCredits;

    public CourseDetails(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    public CourseDetails(String code, String title, int credits) {
        this(code, title, credits, 0);
    }

    public int totalCredits() {
        return credits + labCredits;
    }
}

public class CourseCreditManagement {
    public static void main(String[] args) {
        CourseDetails theory = new CourseDetails(
            "21CSC201J", "Data Structures", 4
        );

        CourseDetails lab = new CourseDetails(
            "21CSC205L", "DSA Lab", 3, 1
        );

        System.out.println("21CSC201J total credits: " + theory.totalCredits());
        System.out.println("21CSC205L total credits: " + lab.totalCredits());
    }
}
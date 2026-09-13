class CollegeStudent {
    String name;
    double attendance;

    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;

    CollegeStudent(String name, double attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++;
    }

    static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }
}

public class CollegeInformationManagement {
    public static void main(String[] args) {
        CollegeStudent student1 = new CollegeStudent("Ravi", 85);
        CollegeStudent student2 = new CollegeStudent("Anitha", 90);

        System.out.println("2 Student objects created");
        CollegeStudent.printCollegeInfo();
    }
}
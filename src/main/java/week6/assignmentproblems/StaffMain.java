class StaffMember {
    String empId;
    String empName;
    double salary;
    boolean isIntern;

    public StaffMember(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    public StaffMember(String empId, String empName) {
        this(empId, empName, 0);
        this.isIntern = true;
    }

    void printProfile() {
        System.out.println(empId + " | " + empName + " | Rs " + salary + " | Intern: " + isIntern);
    }
}

public class StaffMain {
    public static void main(String[] args) {
        StaffMember e1 = new StaffMember("E-101", "Divya", 65000);
        StaffMember e2 = new StaffMember("E-102", "Arjun");

        e1.printProfile();
        e2.printProfile();
    }
}
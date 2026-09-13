class Worker {
    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    Worker(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class CompanyMain {
    public static void main(String[] args) {
        Worker e1 = new Worker("Rahul", 50000);
        Worker e2 = new Worker("Arjun", 60000);
        Worker e3 = new Worker("Divya", 65000);

        Worker.printCompanyInfo();
    }
}
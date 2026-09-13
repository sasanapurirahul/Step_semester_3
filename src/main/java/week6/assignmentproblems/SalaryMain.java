class SalaryAccount {
    private double basicSalary;
    private double bonus;

    SalaryAccount(double basicSalary) {
        if (basicSalary < 0) {
            System.out.println("Invalid salary. Starting with 0.");
            this.basicSalary = 0;
        } else {
            this.basicSalary = basicSalary;
        }
    }

    public void creditBonus(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid bonus amount");
        } else {
            bonus += amount;
            System.out.println("Bonus credited: Rs " + amount);
        }
    }

    public void deductTax(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Invalid tax percentage");
        } else {
            basicSalary = basicSalary - (basicSalary * percent / 100);
            System.out.println("Tax deducted: " + percent + "%");
        }
    }

    public double getNetSalary() {
        return basicSalary + bonus;
    }
}

public class SalaryMain {
    public static void main(String[] args) {
        SalaryAccount s = new SalaryAccount(50000);

        s.creditBonus(5000);
        s.deductTax(10);

        System.out.println("Net salary: Rs " + s.getNetSalary());
    }
}
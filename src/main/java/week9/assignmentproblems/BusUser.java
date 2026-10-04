import java.util.*;

interface BusUser {
    double getTransportFee();
}

abstract class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    abstract double getFee();
}

class DayScholar extends Student implements BusUser {
    DayScholar(String name) {
        super(name);
    }

    public double getFee() {
        return 40000;
    }

    public double getTransportFee() {
        return 12000;
    }
}

class Hosteller extends Student {
    Hosteller(String name) {
        super(name);
    }

    public double getFee() {
        return 40000 + 60000;
    }
}

class Scholar extends Student implements BusUser {
    Scholar(String name) {
        super(name);
    }

    public double getFee() {
        return 20000;
    }

    public double getTransportFee() {
        return 12000;
    }
}

class CollegeFeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();

            Student student;

            if (type.equals("DAY_SCHOLAR")) {
                student = new DayScholar(name);
            } else if (type.equals("HOSTELLER")) {
                student = new Hosteller(name);
            } else {
                student = new Scholar(name);
            }

            double fee = student.getFee();

            if (student instanceof BusUser) {
                fee += ((BusUser) student).getTransportFee();
            }

            System.out.printf("%s: %.2f%n", name, fee);
            total += fee;
        }

        System.out.printf("Total Collected: %.2f%n", total);

        sc.close();
    }
}
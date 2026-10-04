import java.util.*;

interface Transport {
    double calculateFare(double distance, double peakHourFactor);
}

class Bus implements Transport {
    public double calculateFare(double distance, double peakHourFactor) {
        return Math.min(2 + 0.10 * distance, 10);
    }
}

class Train implements Transport {
    public double calculateFare(double distance, double peakHourFactor) {
        return 3 + 0.15 * distance;
    }
}

class Metro implements Transport {
    public double calculateFare(double distance, double peakHourFactor) {
        return (1.50 + 0.20 * distance) * peakHourFactor;
    }
}

class PublicTransportFareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double distance = sc.nextDouble();
            double factor = 1.0;

            if (type.equals("METRO")) {
                factor = sc.nextDouble();
            }

            Transport transport;

            if (type.equals("BUS")) {
                transport = new Bus();
            } else if (type.equals("TRAIN")) {
                transport = new Train();
            } else {
                transport = new Metro();
            }

            double fare = transport.calculateFare(distance, factor);

            System.out.printf("%s: %.2f%n", type, fare);
            total += fare;
        }

        System.out.printf("Total: %.2f%n", total);

        sc.close();
    }
}
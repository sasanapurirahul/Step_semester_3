import java.util.*;

abstract class Booking {
    static final double BOOKING_FEE = 50;
    double distance;

    Booking(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();

    double calculateTotal() {
        return calculateFare() + BOOKING_FEE;
    }
}

class Bus extends Booking {
    Bus(double distance) {
        super(distance);
    }

    double calculateFare() {
        return 2 * distance;
    }
}

class Train extends Booking {
    Train(double distance) {
        super(distance);
    }

    double calculateFare() {
        return 1.5 * distance;
    }
}

class Flight extends Booking {
    Flight(double distance) {
        super(distance);
    }

    double calculateFare() {
        return 2500 + 4 * distance;
    }
}

class TravelBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String mode = sc.next();
            double distance = sc.nextDouble();

            Booking booking;

            if (mode.equals("BUS")) {
                booking = new Bus(distance);
            } else if (mode.equals("TRAIN")) {
                booking = new Train(distance);
            } else {
                booking = new Flight(distance);
            }

            System.out.printf("%s: %.2f%n", mode, booking.calculateTotal());
        }

        sc.close();
    }
}
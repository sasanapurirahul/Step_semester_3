class ExamTicket {
    String studentName;
    int seatNumber;

    ExamTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }
}

public class TicketMain {
    public static void main(String[] args) {
        ExamTicket priya = new ExamTicket("Priya", 0);

        ExamTicket copy = priya;
        copy.seatNumber = 45;

        ExamTicket separate = new ExamTicket("Priya", 45);

        System.out.println("Priya's seatNumber: " + priya.seatNumber);
        System.out.println("copy == priya: " + (copy == priya));
        System.out.println("separate == priya: " + (separate == priya));
    }
}
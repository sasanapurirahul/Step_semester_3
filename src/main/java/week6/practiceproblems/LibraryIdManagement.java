class LibraryCard {
    String name;
    int booksIssued;

    LibraryCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }
}

public class LibraryIdManagement {
    public static void main(String[] args) {
        LibraryCard ravi = new LibraryCard("Ravi", 0);

        LibraryCard duplicate = ravi;

        duplicate.booksIssued = 3;

        LibraryCard separate = new LibraryCard("Ravi", 3);

        System.out.println("Ravi's booksIssued (via first variable): " + ravi.booksIssued);
        System.out.println("duplicate == ravi: " + (duplicate == ravi));
        System.out.println("separate == ravi: " + (separate == ravi));
    }
}
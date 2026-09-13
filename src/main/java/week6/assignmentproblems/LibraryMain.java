class LibraryBook {
    String title;
    String author;
    int copiesAvailable;

    LibraryBook(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    void printEntry() {
        System.out.println(title + " by " + author + " - " + copiesAvailable + " copies available");
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        LibraryBook[] books = {
            new LibraryBook("Clean Code", "Robert C. Martin", 3),
            new LibraryBook("Effective Java", "Joshua Bloch", 5),
            new LibraryBook("Refactoring", "Martin Fowler", 0),
            new LibraryBook("Design Patterns", "GoF", 2)
        };

        for (LibraryBook b : books) {
            b.printEntry();
        }
    }
}
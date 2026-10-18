class BookLibrary {
    int booksAvailable;

    static String libraryName = "Central Library";

    void issueBook() {
        int books = booksAvailable;

        if (books > 0) {
            books--;
            booksAvailable = books;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("No books available.");
        }
    }

    void returnBook() {
        int books = booksAvailable;

        books++;
        booksAvailable = books;

        System.out.println("Book returned successfully.");
    }

    public static void main(String[] args) {
        BookLibrary library = new BookLibrary();

        library.booksAvailable = 5;

        System.out.println("Library: " + libraryName);
        System.out.println("Available Books: " + library.booksAvailable);

        library.issueBook();
        System.out.println("Available Books: " + library.booksAvailable);

        library.returnBook();
        System.out.println("Available Books: " + library.booksAvailable);
    }
}
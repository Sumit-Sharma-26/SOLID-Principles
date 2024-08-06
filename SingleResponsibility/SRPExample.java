public class Book {
    private String title;
    private String author;

    // constructor, getters, and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

public class BookPrinter {
    public void print(Book book) {
        System.out.println(book.getTitle() + " by " + book.getAuthor());
    }
}

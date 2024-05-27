public class Book {
    private String title;
    private Author author;
    private int PublicationYear;

    public Book(String title, Author author, int PublicationYear) {
        this.title = title;
        this.author = author;
        this.PublicationYear = PublicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return PublicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.PublicationYear = publicationYear;
    }
}

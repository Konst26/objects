import java.util.Objects;

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

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", PublicationYear=" + PublicationYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return PublicationYear == book.PublicationYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, PublicationYear);
    }
}


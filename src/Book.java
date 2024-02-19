import java.util.Objects;

public class Book {
    private String nameBook;
    private Author authorBook;
    private int yearBook;

    public Book(String nameBook, Author authorBook, int yearBook) {
        this.nameBook = nameBook;
        this.yearBook = yearBook;
        this.authorBook = authorBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getYearBook() {
        return yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }

    public Author getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(Author authorBook) {
        this.authorBook = authorBook;
    }

    @Override
    public String toString() {
        return authorBook.toString() + "Название произведения - " + this.nameBook + "\nДата издания - " + this.yearBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearBook == book.yearBook && Objects.equals(nameBook, book.nameBook) && Objects.equals(authorBook, book.authorBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, authorBook, yearBook);
    }
}
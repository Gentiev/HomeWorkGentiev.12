public class Book {
    private String nameBook;
    private Author authorBook;
    private int yearBook;

    public Book(String nameBook, Author authorBook, int yearBook) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.yearBook = yearBook;
    }

    public String getNameBook() {
        return nameBook;
    }
    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }
    public Author getAuthorBook() {
        return authorBook;
    }
    public void setAuthorBook(Author authorBook) {
        this.authorBook = authorBook;
    }
    public int getYearBook() {
        return yearBook;
    }
    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
}
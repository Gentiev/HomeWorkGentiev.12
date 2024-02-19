import java.util.Objects;

public class Author {
    private String authorName;
    private String authorFemale;

    public Author(String authorName, String authorFemale) {
        this.authorName = authorName;
        this.authorFemale = authorFemale;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorFemale() {
        return this.authorFemale;
    }

    public void setAuthorFemale(String authorFemale) {
        this.authorFemale = authorFemale;
    }

    @Override
    public String toString() {
        return "Автор произведения - " + authorName + " " + authorFemale + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorName, author.authorName) && Objects.equals(authorFemale, author.authorFemale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorFemale);
    }
}
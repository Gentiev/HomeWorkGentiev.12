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
}
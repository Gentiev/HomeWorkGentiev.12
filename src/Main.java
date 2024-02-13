public class Main {
    public static void main(String[] args) {
        Author lev = new Author("lev","tolstiy");
        Book theNightIsBezze = new Book("The Night", lev, 1912);
        System.out.println(theNightIsBezze.getNameBook());
        System.out.println("author: " + lev.getAuthorName() + " " + lev.getAuthorFemale());
        System.out.println(theNightIsBezze.getYearBook());

        theNightIsBezze.setYearBook(2000);
        System.out.println(theNightIsBezze.getYearBook());
        System.out.println("--------------------");

        Author anacondaz = new Author("Anacondaz",".ru");
        Book cdmm = new Book("Call me back", lev, 2016);
        System.out.println("album: " + cdmm.getNameBook());
        System.out.println("author: " + anacondaz.getAuthorName() + anacondaz.getAuthorFemale());
        System.out.println(cdmm.getYearBook());
    }
}
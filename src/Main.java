public class Main {
    public static void main(String[] args) {
        Author fitzdzherald = new Author("Fitzdzherald","tolstiy");
        Book theNightIsBezze = new Book("The Night", fitzdzherald, 1912);
        System.out.println(theNightIsBezze.getNameBook());
        System.out.println("author: " + fitzdzherald.getAuthorName() + " " + fitzdzherald.getAuthorFemale());
        System.out.println(theNightIsBezze.getYearBook());

        theNightIsBezze.setYearBook(2000);
        System.out.println(theNightIsBezze.getYearBook());
        System.out.println("--------------------");

        Author anacondaz = new Author("Anacondaz",".ru");
        Book cdmm = new Book("Call me back", anacondaz, 2016);
        System.out.println("album: " + cdmm.getNameBook());
        System.out.println("author: " + anacondaz.getAuthorName() + anacondaz.getAuthorFemale());
        System.out.println(cdmm.getYearBook());

        System.out.println(anacondaz.toString());
        System.out.println(cdmm.toString());
        System.out.println(fitzdzherald.equals(anacondaz));
        System.out.println(theNightIsBezze.equals(cdmm));

        Author anaconda = new Author("Anacondaz",".ru");
        Book cdmmm = new Book("Call me back", anaconda, 2026);
        System.out.println(anaconda.equals(anacondaz));
        System.out.println(cdmmm.equals(cdmm));

    }
}
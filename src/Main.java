public class Main {

    public static void main(String[] args) {
        Author mihail = new Author("Mihail", "Lermontov");
        Book road = new Book("Road", mihail, 2000);
        System.out.println(road.getTitle() + " " + road.getPublicationYear());
        road.setPublicationYear(2005);
        System.out.println(road.getTitle() + " " + road.getPublicationYear());
        System.out.println(road.getTitle() + " " + road.getAuthor().getFirstName() + " " + road.getAuthor().getLastName() + " " +  road.getPublicationYear());

    }
}
public class Main {

    public static void main(String[] args) {
        Author mihail = new Author("Mihail", "Lermontov");
        Book road = new Book("Road", mihail, 2000);
        System.out.println(road.getTitle() + " " + road.getPublisherYear());
        road.setPublisherYear(2005);
        System.out.println(road.getTitle() + " " + road.getPublisherYear());
        System.out.println(road.getAuthor().getFirstName() + " " + road.getAuthor().getLastNAme());

    }
}
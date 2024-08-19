public class Main {
    public static void main(String[] args) {

        Author author = new Author("Стивенсон", "Роберт Льюис");

        Book book = new Book("The Suicide Club", 1878, author);

        System.out.println("Год публикации: " + book.getPublicationYear());

        book.setPublicationYear(1879);

        System.out.println("Год публикации: " + book.getPublicationYear());


    }
}
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Franklin Patrick", "Herbert");
        Book book1 = new Book("Dune", author1, 1965);
        book1.setPublicationYear(2021);
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Name of the book: " + book1.getBooksName());
        System.out.println("Year of the publication: " + book1.getPublicationYear());

        Author author2 = new Author("J.K.", "Rowling");
        Book book2 = new Book("Harry Potter and the Philosopher's Stone", author2, 1997);
        System.out.println("\n" + book2.getAuthor() + ", " + book2.getBooksName() + ", " + book2.getPublicationYear());

    }
}

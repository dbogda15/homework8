public class Book {
    private final String booksName;
    private final Author author;
    private int publicationYear;

    public Book (String booksName, Author author, int publicationYear) {
        this.booksName = booksName;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getBooksName () {
        return this.booksName;
    }

    public String getAuthor () {
        return author.getAuthorsFirstName() + " " + author.getAuthorsSurname();
    }

    public int getPublicationYear () {
        return publicationYear;
    }

    public void setPublicationYear (int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
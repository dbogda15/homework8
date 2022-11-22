public class Author {
    private final String authorsFirstName;
    private final String authorsSurname;

    public Author (String authorsFirstName, String authorsSurname) {
        this.authorsFirstName = authorsFirstName;
        this.authorsSurname = authorsSurname;
    }

    public String getAuthorsFirstName () {
        return this.authorsFirstName;
    }

    public String getAuthorsSurname () {
        return this.authorsSurname;
    }
}

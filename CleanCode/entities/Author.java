package CleanCode.entities;

public class Author {
    private Long authorId;
    private String authorName;

    public Author() {
    }

    public Author(Long authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
    }

}

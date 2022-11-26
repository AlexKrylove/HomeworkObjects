import java.util.Objects;

public class Author {
    public String nameAuthor;
    public String lastNameAuthor;

    public Author(String nameAuthor, String lastNameAuthor) {
        this.nameAuthor = nameAuthor;
        this.lastNameAuthor = lastNameAuthor;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getLastNameAuthor() {
        return this.lastNameAuthor;
    }

    @Override
    public String toString() {
        return this.nameAuthor + this.lastNameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(lastNameAuthor, author.lastNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, lastNameAuthor);
    }
}



package comicbook;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "comicbooks", schema = "test")
public class Comicbooks {
    private int id;
    private String title;
    private String genre;
    private int author;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "genre")
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Basic
    @Column(name = "author")
    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comicbooks that = (Comicbooks) o;
        return id == that.id &&
                author == that.author &&
                Objects.equals(title, that.title) &&
                Objects.equals(genre, that.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, genre, author);
    }
}

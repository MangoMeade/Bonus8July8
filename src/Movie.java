/**
 * Created by aibar on 7/7/2017.
 */
public class Movie {
    String format = "%-16s%-16s%s%n";
    String title;
    String category;

    public Movie(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }
    @Override
    public String toString() {
        return String.format("%-36s%-16s", title, category);
    }
}
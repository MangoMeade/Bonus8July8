import java.util.*;

/**
 * Created by aibar on 7/7/2017.
 */
public class MovieCategory {
    public static void main(String[] args) {
        movieCategories();
    }

    private static void movieCategories() {
        Movie movie1 = new Movie("Star Wars", "sci-fi");
        Movie movie2 = new Movie("Jurassic Park", "sci-fi");
        Movie movie3 = new Movie("Toy Story", "animated");
        Movie movie4 = new Movie("Moana", "animated");
        Movie movie5 = new Movie("The Godfather", "drama");
        Movie movie6 = new Movie("Forrest Gump", "drama");
        Movie movie7 = new Movie("A Nightmare on Elm Street", "horror");
        Movie movie8 = new Movie("Jaws", "horror");
        Movie movie9 = new Movie("Up", "animated");
        Movie movie10 = new Movie("Ben-Hur", "drama");
        Movie[] list = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        ArrayList<Movie> listMovies = new ArrayList<>();
        listMovies.addAll(Arrays.asList(list));

        Collections.sort(listMovies, Comparator.comparing(Movie::getTitle));

        Scanner scnr = new Scanner(System.in);
        String userInput = " ";
        System.out.println("Welcome to the Movie List Application!");
        System.out.println("There are 10 movies in this list.");
        String loop = "y";

        while (loop.equalsIgnoreCase("y")) {
            System.out.println("What category are you interested in? (animated, drama, horror, sci-fi)");

            userInput = scnr.nextLine();
            while (userInput.matches("\\d+")) {
                System.out.println("Choose from the available categories");
                userInput = scnr.nextLine();
            }
            while (!(userInput.equalsIgnoreCase("animated") || userInput.equalsIgnoreCase("drama") || userInput.equalsIgnoreCase("horror") || userInput.equalsIgnoreCase("sci-fi"))) {
                System.out.println("Choose from the available categories");
                userInput = scnr.nextLine();
            }
            for (Movie movie : listMovies) {
                if (movie.getCategory().equals(userInput)) {
                    System.out.println(movie.getTitle());
                }
            }
            System.out.println("Check another category? (y/n)");
            loop = scnr.nextLine();
        }
        if (loop.equalsIgnoreCase("n")) {
            System.out.println("Bye!");
        }
    }
}

import java.util.*;

/**
 * Created by aibar on 7/7/2017.
 */
public class MovieCategory2 {
    public static void main(String[] args) {
        movieCategories();

    }

    private static void movieCategories() {
        MovieIO movies = new MovieIO();
        Movie[] list = new Movie[100];

        for (int i = 1; i < 100; i++) {
            list[i] = movies.getMovie(i);
        }
        ArrayList<Movie> listMovies = new ArrayList<>();
        listMovies.addAll(Arrays.asList(list));

        Scanner scnr = new Scanner(System.in);
        String userInput = " ";
        System.out.println("Welcome to the Movie List Application!");
        System.out.println("There are 10 movies in this list.");
        String loop = "y";

        while (loop.equalsIgnoreCase("y")) {
            System.out.println("What category are you interested in? (animated, drama, horror, musical, scifi)");

            userInput = scnr.nextLine();
            while (userInput.matches("\\d+")) {
                System.out.println("Choose from the available categories");
                userInput = scnr.nextLine();
            }
            while (!(userInput.equalsIgnoreCase("animated") || userInput.equalsIgnoreCase("drama") || userInput.equalsIgnoreCase("horror") || userInput.equalsIgnoreCase("musical") ||userInput.equalsIgnoreCase("scifi"))) {
                System.out.println("Choose from the available categories");
                userInput = scnr.nextLine();
            }

            for (int i = 0; i < listMovies.size(); i++) {
                if (movies.getMovie(i).getCategory().equals(userInput)) {
                    System.out.println(movies.getMovie(i));
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

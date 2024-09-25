import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Question4 {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 10) {
            System.out.println(number);
            number++;
        }
        for (int number2 = 1; number2 <= 10; number2++) {
            System.out.println(number2);
        }
        Scanner scanner = new Scanner(System.in);
        List<String> movies = new ArrayList<>();
        System.out.println("Enter movie names (type 'done' to finish):");
        while (true) {
            String movie = scanner.nextLine();
            if (movie.equalsIgnoreCase("done")) {
                break;
            }
            movies.add(movie);
        }
        scanner.close();
        System.out.println("Your list of movies:");
        for (String film : movies) {
            System.out.println(film);
        }
    }

    }


package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class TopTrendingMovies {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Inception", 9.0, 2021),
                new Movie("Interstellar", 8.5, 2022),
                new Movie("Tenet", 7.8, 2020),
                new Movie("Dune", 8.7, 2023),
                new Movie("Oppenheimer", 9.1, 2023),
                new Movie("Joker", 8.6, 2021),
                new Movie("Avengers", 8.4, 2022)
        );

        List<Movie> topMovies = movies.stream()
                .filter(m -> m.getRating() > 8 && m.getReleaseYear() > 2020)
                .sorted(Comparator.comparingDouble(Movie::getRating).reversed()
                        .thenComparing(Movie::getReleaseYear).reversed())
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("Top 5 Trending Movies:");
        topMovies.forEach(System.out::println);
    }

    static class Movie {
        private String title;
        private double rating;
        private int releaseYear;

        public Movie(String title, double rating, int releaseYear) {
            this.title = title;
            this.rating = rating;
            this.releaseYear = releaseYear;
        }

        public double getRating() {
            return rating;
        }

        public int getReleaseYear() {
            return releaseYear;
        }

        @Override
        public String toString() {
            return title + " (" + releaseYear + ") - Rating: " + rating;
        }
    }
}


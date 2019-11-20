package com.thomasmullins.database.HelloWorld.movieDatabase;

import java.util.List;

import static input.InputUtils.*;

public class MovieList {

    static final String db = "jdbc:sqlite:movie_watchlist.sqlite";

    private static Database database;

    public static void main(String[] args) {
        database = new Database(db);
        addNewMovies();
        displayAllMovies();
        checkIfWatchedAndRate();
        deleteWatchedMovies();
        searchForMovie();

    }
    private static void addNewMovies() {
        do {

            String movieName = stringInput("Enter a movie name: ");
            Movie movie = new Movie(movieName);
            database.addNewMovie(movie);

        } while (yesNoInput("Add a movie to the wish list database? "));
    }
    private static void displayAllMovies() {
        List<Movie> allMovies = database.getAllMovies();
        for(Movie movie: allMovies){
            System.out.println(movie.name);
        }
    }
    private static void checkIfWatchedAndRate() {

        List<Movie> unwatchedMovies = database.getAllMoviesByWatched(false);
        for (Movie movie: unwatchedMovies) {
            boolean hasWatched = yesNoInput("Have you watched "+ movie.name +"?");
            if (hasWatched){
                int stars = intInput("what was your rating for " +movie.name+ " out of 5 stars?");
                movie.watched = true;
                movie.stars = stars;
                database.updateMovie(movie);
            }
        }
    }

    private static void deleteWatchedMovies() {

        //get all watched movies
        //loop over, and ask user if movie should be deleted

        System.out.println("Here are the movies you have watched.");

        List<Movie> watchedMovies = database.getAllMoviesByWatched(true);

        for (Movie movie: watchedMovies) {
            boolean delete = yesNoInput("Delete "+ movie.name + "?");
            if (delete) {
                database.deleteMovie(movie);
            }
        }
    }
    private static void searchForMovie() {
        String movieName = stringInput("Enter a movie name");
        List<Movie> matches = database.search(movieName);

        if (matches.isEmpty()) {
            System.out.println("No matches");
        } else {
            System.out.println("Here are your matching movies:");
            for (Movie movie : matches) {
                System.out.println(movie.name);
            }
        }
    }
}

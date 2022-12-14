package tasksDay31.movie;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country, title, Genre, releaseDate, director;

    public ArrayList<String> casts;

    public Movie(String country, String title, String gene,String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
        casts = new ArrayList<>();
    }

    public void addCast(String name) {        // adds the given string argument to the arrayList casts

        casts.add(name);

    }

    public void addCasts(String[] names) {
        casts.addAll(Arrays.asList(names)); //adds the given string array argument to the arrayList casts
    }



    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", Genre='" + Genre + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", total number of casts = " +casts.size() +
                '}';
    }
}
/*
Movie Task:

	3.1. Create a class named Movie
	    Attributes:
	        country (String), title (String), Genre (String), releaseDate (String), director (String), casts (ArrayList<String>)

		Add a constructor to set the country, title, release date, and director of the Movie

	    Actions
	        addCast(String): adds the given string argument to the arrayList casts
	        addCasts(String[]): adds the given string array argument to the arrayList casts
	        toString(): returns the name of country, title, release date, and total number of casts
 */
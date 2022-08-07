package tasksDay31.movie;

public class MovieObjects {

    public static void main(String[] args) {

        String gene = "Adventure, Comedy, Thriller";
        String title = "Journey to SDET: Cydeo Batch 25";
        String[] casts = {"Asiya", "Adam", "Muhtar", "Akbar", "Gurhan", "Saim", "Murodil", "Nadir", "Guljannet"};


        Movie movie1 = new Movie("Kazakhstan","Moonlight","Comedy","25th of December 2022","Kunayev");
        movie1.addCasts(casts);
        System.out.println(movie1);


    }
}
/*
3.2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 25
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group
        print the full info of the movie
 */
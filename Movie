import java.util.ArrayList;
public class Movie {
    private String title;
    private String studio;
    private String rating;
    public Movie(String title,String studio,String rating)
    {
        this.title= title;
        this.studio =studio;
        this.rating =rating;
    }
    public Movie(String title,String studio)
    {
        this.title= title;
        this.studio =studio;
        rating ="PG";
    }
    public static Movie[] getPG(Movie movies[])
    {
        ArrayList<Movie> moviesList = new ArrayList<>();
        for(int i=0;i<movies.length;i++)
        {
            if(movies[i].rating.contains("PG"))
                moviesList.add(movies[i]);
        }
        return (moviesList.toArray(new Movie[0]));

    }
    public static void main(String args[])
    {
        Movie m1 = new Movie("Casino Royale","Eon Productions","PG-13");
        Movie m2 = new Movie("Inception","Syncopy","R");
        Movie m3 = new Movie("Harry Potter","Bloomsbury","PG-17");
        Movie m4 = new Movie("Lucifer","xyz","R");
        Movie m5 = new Movie("life of pi","pqr");
        Movie pgMovies[] = getPG(new Movie[]{m1,m2,m3,m4,m5});
        System.out.println("List of PG movies:-");
        for(int i=0;i<pgMovies.length;i++)
            System.out.println(pgMovies[i].title);
    }

}

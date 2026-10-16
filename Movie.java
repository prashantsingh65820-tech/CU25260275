class Movie {
    String name;
    String genre;
    double rating;

    static String industry = "Bollywood";

    void display() {
        String movieName = name;
        String movieGenre = genre;
        double movieRating = rating;

        System.out.println("Name: " + movieName);
        System.out.println("Genre: " + movieGenre);
        System.out.println("Rating: " + movieRating);
        System.out.println("Industry: " + industry);
    }

    public static void main(String[] args) {
        Movie m = new Movie();

        m.name = "Example Movie";
        m.genre = "Action";
        m.rating = 8.2;

        m.display();
    }
}
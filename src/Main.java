public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.name = "Elementos";
        movie.releaseYear = 2023;
        movie.durationInMinutes = 102;
        movie.includedInThePlan = true;

        movie.showTechnicalSheet();
        movie.avaliation(10);
        movie.avaliation(2);

        System.out.println(movie.sumOfRatings);
        System.out.println(movie.totalRatings);

        System.out.println(movie.getMedia());

    }
}

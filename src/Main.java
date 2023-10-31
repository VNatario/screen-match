import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();

        movie.setName("Elementos");
        movie.setReleaseYear(2023);
        movie.setDurationInMinutes(102);
        movie.setIncludedInThePlan(true);

        //metodo de exibir ficha tecnica do filme
        movie.showTechnicalSheet();

        //metodo de avaliar o filme
        movie.setEvaluationTheMovie(10);
        movie.setEvaluationTheMovie(8);

        System.out.println("Total de avaliações: " +movie.getTotalRatings());

        System.out.println("Média de avaliações: "+movie.getEvaluationAverage());

        System.out.println("Duração do filme: " +movie.getDurationInMinutes());

        System.out.println("====================================================\n");

        Series lost  = new Series();
        lost.setName("Lost");
        lost.setReleaseYear(2000);
        lost.showTechnicalSheet();
        lost.setSeasons(10);
        lost.setEpisodesBySeasons(8);

    }
}

import br.com.alura.screenmatch.calculos.TimeCalculator;
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
        lost.setMinutesPerEpisode(20);
        System.out.println("Duração da série: " +lost.getDurationInMinutes()+ " min.");

        Movie mulan = new Movie();
        mulan.setName("Mulan");
        mulan.setReleaseYear(1998);
        mulan.setDurationInMinutes(88);
        mulan.setIncludedInThePlan(true);


        TimeCalculator calc = new TimeCalculator();
        calc.includes(movie);
        calc.includes(mulan);
        calc.includes(lost);
        System.out.println("TEMPO TOTAL: " +calc.getTotalTime()+" min");
    }
}

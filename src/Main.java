import br.com.alura.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.name = "Elementos";
        movie.releaseYear = 2023;
        movie.durationInMinutes = 102;
        movie.includedInThePlan = true;

        //metodo de exibir ficha tecnica do filme
        movie.showTechnicalSheet();

        //metodo de avaliar o filme
        movie.setEvaluationTheMovie(10);
        movie.setEvaluationTheMovie(8);

        System.out.println("Total de avaliações: " +movie.getTotalRatings());

        System.out.println("Média de avaliações: "+movie.getEvaluationAverage());


    }
}

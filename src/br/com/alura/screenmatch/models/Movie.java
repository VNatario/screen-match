package br.com.alura.screenmatch.models;

// lendo uma classe:
// coisas que um filme tem
public class Movie {
    String name;
    int releaseYear;
    boolean includedInThePlan;
    private double sumOfRatings;
    private int totalRatings;
    int durationInMinutes;

    void  showTechnicalSheet() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);

        if(includedInThePlan) System.out.println("Filme incluido no plano");
    }

    void setEvaluationTheMovie(double note){
        sumOfRatings += note;
        totalRatings++;
    }

    // Pega avaliação media dos filmes
    double  getEvaluationAverage(){
        return sumOfRatings/totalRatings;
    }

    int getTotalRatings() {
        return totalRatings;
    }

}

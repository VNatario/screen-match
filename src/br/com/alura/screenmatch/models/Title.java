package br.com.alura.screenmatch.models;

public class Title {
    private String name;
    private int releaseYear;
    private int durationInMinutes;
    private boolean includedInThePlan;

    private double sumOfRatings;
    private int totalRatings;

    public void  showTechnicalSheet() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Duração do filme: "+durationInMinutes+ " min.");

        if(includedInThePlan) System.out.println("Filme incluido no plano");
        System.out.println("\n");
    }

    public void setEvaluationTheMovie(double note){
        sumOfRatings += note;
        totalRatings++;
    }

    // Pega avaliação media dos filmes
    public double  getEvaluationAverage(){
        return sumOfRatings/totalRatings;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}

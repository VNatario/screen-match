// lendo uma classe:
// coisas que um filme tem
public class Movie {
    String name;
    int releaseYear;
    boolean includedInThePlan;
    double sumOfRatings;
    int totalRatings;
    int durationInMinutes;

    void  showTechnicalSheet() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    void avaliation(double note){
        sumOfRatings += note;
        totalRatings++;
    }

    double getMedia(){
        return sumOfRatings/totalRatings;
    }

}

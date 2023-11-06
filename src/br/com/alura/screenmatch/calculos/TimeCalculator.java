package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

//    public void includes(Movie movie){
//        this.totalTime += movie.getDurationInMinutes();
//    }
//
//    public void includes(Series series){
//        this.totalTime += series.getDurationInMinutes();
//    }

    public void includes(Title title) {
        this.totalTime += title.getDurationInMinutes();

    }
}

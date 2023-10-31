package br.com.alura.screenmatch.models;

// lendo uma classe:
// coisas que um filme tem

//Movie herda tudo de Title --> Movie faz tudo que Title faz (herança)
public class Movie extends Title {
 private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}

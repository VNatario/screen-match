package br.com.alura.screenmatch.models;

public class Series extends Title{
    private int seasons;
    private int episodesBySeasons;
    private boolean active;
    private int minutesPerEpisode;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesBySeasons() {
        return episodesBySeasons;
    }

    public void setEpisodesBySeasons(int episodesBySeasons) {
        this.episodesBySeasons = episodesBySeasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }
}

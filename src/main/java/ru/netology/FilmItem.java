package ru.netology;

public class FilmItem{

    private int filmId;
    private String filmName;
    private int count;
    private int limit;


    public FilmItem(int filmId, String filmName, int count) {
        this.filmId = filmId;
        this.filmName = filmName;
        this.count = count;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }


}




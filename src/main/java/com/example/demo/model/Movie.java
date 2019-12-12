package com.example.demo.model;

import com.example.demo.dto.RatingsDTO;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "MOVIE")
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movie_id")
    private int movieID;
    @Column(name = "Title")
    private String title;
    @Column(name = "Year")
    private Integer year;
    @Column(name = "Rated")
    private String rated;
    @Column(name = "Released")
    private String released;
    @Column(name = "Runtime")
    private String runtime;
    @Column(name = "Genre")
    private String genre;
    @Column(name = "Director")
    private String director;
    @Column(name = "Writer")
    private String writer;
    @Column(name = "Actors")
    private String actors;
    @Column(name = "Plot")
    private String plot;
    @Column(name = "Language")
    private String language;
    @Column(name = "Country")
    private String country;
    @Column(name = "Awards")
    private String awards;
    @Column(name = "Poster")
    private String poster;
    //    @ManyToOne
//    @JoinColumn(name = "id_ratings", nullable = false)
//    @Column(name = "rating_id")
//    private List<Ratings> ratingsID;
    @Column(name = "Metascore")
    private String metaScore;
    @Column(name = "imdbRating")
    private Double imdbRating;
    @Column(name = "imdbVotes")
    private String imdbVotes;
    @Column(name = "imdbID")
    private String imdbID;
    @Column(name = "Type")
    private String type;
    @Column(name = "DVD")
    private String dvd;
    @Column(name = "BoxOffice")
    private String boxOffice;
    @Column(name = "Production")
    private String production;
    @Column(name = "Website")
    private String website;
    @Column(name = "Response")
    private Boolean response;

    public Movie() {
    }

    public Movie(String title, Integer year, String rated, String released,
                 String runtime, String genre, String director, String writer,
                 String actors, String plot, String language, String country,
                 String awards, String poster, String metaScore, Double imdbRating,
                 String imdbVotes, String imdbID, String type, String dvd,
                 String boxOffice, String production, String website, Boolean response) {
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.released = released;
        this.runtime = runtime;
        this.genre = genre;
        this.director = director;
        this.writer = writer;
        this.actors = actors;
        this.plot = plot;
        this.language = language;
        this.country = country;
        this.awards = awards;
        this.poster = poster;
        this.metaScore = metaScore;
        this.imdbRating = imdbRating;
        this.imdbVotes = imdbVotes;
        this.imdbID = imdbID;
        this.type = type;
        this.dvd = dvd;
        this.boxOffice = boxOffice;
        this.production = production;
        this.website = website;
        this.response = response;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getMetaScore() {
        return metaScore;
    }

    public void setMetaScore(String metaScore) {
        this.metaScore = metaScore;
    }

    public Double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(Double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getImdbVotes() {
        return imdbVotes;
    }

    public void setImdbVotes(String imdbVotes) {
        this.imdbVotes = imdbVotes;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDvd() {
        return dvd;
    }

    public void setDvd(String dvd) {
        this.dvd = dvd;
    }

    public String getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(String boxOffice) {
        this.boxOffice = boxOffice;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Boolean getResponse() {
        return response;
    }

    public void setResponse(Boolean response) {
        this.response = response;
    }


}

package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class MovieDTO implements Serializable {

    @JsonProperty(value = "Title")
    private String title;
    @JsonProperty(value = "Year")
    private Integer year;
    @JsonProperty(value = "Rated")
    private String rated;
    @JsonProperty(value = "Released")
    private String released;
    @JsonProperty(value = "Runtime")
    private String runtime;
    @JsonProperty(value = "Genre")
    private String genre;
    @JsonProperty(value = "Director")
    private String director;
    @JsonProperty(value = "Writer")
    private String writer;
    @JsonProperty(value = "Actors")
    private String actors;
    @JsonProperty(value = "Plot")
    private String plot;
    @JsonProperty(value = "Language")
    private String language;
    @JsonProperty(value = "Country")
    private String country;
    @JsonProperty(value = "Awards")
    private String awards;
    @JsonProperty(value = "Poster")
    private String poster;
    @JsonProperty(value = "Ratings")
    private List<RatingsDTO> ratings;
    @JsonProperty(value = "Metascore")
    private String metaScore;
    @JsonProperty(value = "imdbRating")
    private Double imdbRating;
    @JsonProperty(value = "imdbVotes")
    private String imdbVotes;
    @JsonProperty(value = "imdbID")
    private String imdbID;
    @JsonProperty(value = "Type")
    private String type;
    @JsonProperty(value = "DVD")
    private String dvd;
    @JsonProperty(value = "BoxOffice")
    private String boxOffice;
    @JsonProperty(value = "Production")
    private String production;
    @JsonProperty("Website")
    private String website;
    @JsonProperty("Response")
    private Boolean response;

    public MovieDTO() {
    }

    public MovieDTO(String title, Integer year, String rated, String released,
                    String runtime, String genre, String director, String writer,
                    String actors, String plot, String language, String country,
                    String awards, String poster, List<RatingsDTO> ratings,
                    String metaScore, Double imdbRating, String imdbVotes,
                    String imdbID, String type, String dvd, String boxOffice,
                    String production, String website, Boolean response) {
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
        this.ratings = ratings;
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public void setRatings(List<RatingsDTO> ratings) {
        this.ratings = ratings;
    }

    public void setMetaScore(String metaScore) {
        this.metaScore = metaScore;
    }

    public void setImdbRating(Double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public void setImdbVotes(String imdbVotes) {
        this.imdbVotes = imdbVotes;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDvd(String dvd) {
        this.dvd = dvd;
    }

    public void setBoxOffice(String boxOffice) {
        this.boxOffice = boxOffice;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setResponse(Boolean response) {
        this.response = response;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getRated() {
        return rated;
    }

    public String getReleased() {
        return released;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public String getWriter() {
        return writer;
    }

    public String getActors() {
        return actors;
    }

    public String getPlot() {
        return plot;
    }

    public String getLanguage() {
        return language;
    }

    public String getCountry() {
        return country;
    }

    public String getAwards() {
        return awards;
    }

    public String getPoster() {
        return poster;
    }

    public List<RatingsDTO> getRatings() {
        return ratings;
    }

    public String getMetaScore() {
        return metaScore;
    }

    public Double getImdbRating() {
        return imdbRating;
    }

    public String getImdbVotes() {
        return imdbVotes;
    }

    public String getImdbID() {
        return imdbID;
    }

    public String getType() {
        return type;
    }

    public String getDvd() {
        return dvd;
    }

    public String getBoxOffice() {
        return boxOffice;
    }

    public String getProduction() {
        return production;
    }

    public String getWebsite() {
        return website;
    }

    public Boolean getResponse() {
        return response;
    }

}

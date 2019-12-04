package com.example.demo.model;


import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Table(name = "MOVIE")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @Column(name = "TITLE", length = 45, nullable = false)
    private String title;

    @Column(name = "DESCRIPTION", length = 255, nullable = false)
    private String description;

    @Column(name = "WATCHED")
    private boolean watched;

    public Movie() {
    }

    public Movie(long id) {
        this.id = id;
    }

    public Movie(String title, String description, boolean watched) {
        this.title = title;
        this.description = description;
        this.watched = watched;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

}

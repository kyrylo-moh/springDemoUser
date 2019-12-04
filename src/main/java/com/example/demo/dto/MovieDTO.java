package com.example.demo.dto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

public class MovieDTO {

    @NotNull
    private long id;

    @NotNull
    @Length(min = 1, max = 70)
    private String title;

    @NotNull
    @Length(min = 1, max = 500)
    private String description;

    private boolean watched;

    public MovieDTO() {
    }

    public MovieDTO(@NotNull @Length(min = 1, max = 70) String title,
                    @NotNull @Length(min = 1, max = 500) String description,
                    boolean watched) {
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

    @Override
    public String toString() {
        return "MovieDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", watched=" + watched +
                '}';
    }
}

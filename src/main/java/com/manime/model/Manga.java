package com.manime.model;


import jakarta.persistence.*;
import java.util.Date;


@Entity
public class Manga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @Column(name = "genre")
    private String genre;

    @Column(name = "status")
    private String status;

    @Column(name = "description")
    private String description;

    @Column(name = "cover")
    private String cover;

    @Column(name = "chapters")
    private String chapters;

    @Column(name = "views")
    private String views;

    @Column(name = "rating")
    private String rating;

    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private String date;

    @Column(name = "url")
    private String url;


    public Manga() {
    }

    public Manga(String name, String author, String genre, String status, String description,
                 String cover, String chapters, String views, String rating, String date, String url) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.status = status;
        this.description = description;
        this.cover = cover;
        this.chapters = chapters;
        this.views = views;
        this.rating = rating;
        this.date = date;
        this.url = url;
    }
    //GETTERS & SETTERS //

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getChapters() {
        return chapters;
    }

    public void setChapters(String chapters) {
        this.chapters = chapters;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    //TO STRING//

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", status='" + status + '\'' +

                ", description='" + description + '\'' +
                ", cover='" + cover + '\'' +
                ", chapters='" + chapters + '\'' +
                ", views='" + views + '\'' + "}";
    }

    public void setUrl(String s) {
        this.url = s;
    }
}

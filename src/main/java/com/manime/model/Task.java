package com.manime.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Task {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private String status;

    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private String date;

    @Column(name = "timeleft")
    private String timeleft;

    public Task() {
    }

    public Task(Long id, String name, String image, String description, String status, String date, String timeleft) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.description = description;
        this.status = status;
        this.date = date;
        this.timeleft = timeleft;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimeleft() {
        return timeleft;
    }

    public void setTimeleft(String timeleft) {
        this.timeleft = timeleft;
    }
}


package com.klef.jfsd.springboot.model;

public class Activity {
    private int id;
    private String name;
    private String description;
    private String imageUrl;
    private int views;
    private int participations;
    private int interest;

    // Constructor, getters, and setters
    public Activity(int id, String name, String description, String imageUrl, int views, int participations, int interest) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.views = views;
        this.participations = participations;
        this.interest = interest;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getParticipations() {
        return participations;
    }

    public void setParticipations(int participations) {
        this.participations = participations;
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }
}

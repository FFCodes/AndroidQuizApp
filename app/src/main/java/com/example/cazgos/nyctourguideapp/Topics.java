package com.example.cazgos.nyctourguideapp;

public class Topics {
    private String nameOfPlaces;
    private int imageOfPlaces = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Topics (String name) {
        this.nameOfPlaces = name;
    }

    public Topics (String name, int imageId) {
        this.nameOfPlaces = name;
        this.imageOfPlaces = imageId;
    }

    public String getContentName() {
        return nameOfPlaces;
    }

    public int getContentImageId() {
        return imageOfPlaces;
    }

    public void setContentName(String name) {
        this.nameOfPlaces = name;
    }

    public void setContentImageId(int imageId) {
        this.imageOfPlaces = imageId;
    }

    public boolean hasImage() {
        return imageOfPlaces != NO_IMAGE_PROVIDED;
    }

}

package com.example.trymyself;

public class Garage {

    private String name;
    private String plaque;
    private String imageUrl;

    public Garage(String name, String plaque, String imageUrl) {
        this.name = name;
        this.plaque = plaque;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaque() {
        return plaque;
    }

    public void setPlaque(String plaque) {
        this.plaque = plaque;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImage(String image) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "name='" + name + '\'' +
                ", plaque='" + plaque + '\'' +
                ", image='" + imageUrl + '\'' +
                '}';
    }
}

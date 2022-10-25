package com.example.cucanteen.Domain;

public class SliderDomain {
     String name;
    String location;
    Integer imageUrl;

    public SliderDomain(String name, String location, Integer imageUrl) {
        this.name = name;
        this.location = location;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}

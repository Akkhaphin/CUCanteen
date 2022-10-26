package com.example.cucanteen.Domain;

public class LocationDomain {
    Integer locationImg;

    public Integer getLocationImg() {
        return locationImg;
    }

    public void setLocationImg(Integer locationImg) {
        this.locationImg = locationImg;
    }

    public Integer getLocationBg() {
        return locationBg;
    }

    public void setLocationBg(Integer locationBg) {
        this.locationBg = locationBg;
    }

    public LocationDomain(Integer locationImg, Integer locationBg) {
        this.locationImg = locationImg;
        this.locationBg = locationBg;
    }

    Integer locationBg;
}

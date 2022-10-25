package com.example.cucanteen.Domain;

public class FavDomain {
    String name;
    Integer imageUrl1;
    Integer imageUrl2;
    Integer imageUrl3;

    public FavDomain(String name, Integer imageUrl1, Integer imageUrl2, Integer imageUrl3) {
        this.name = name;
        this.imageUrl1 = imageUrl1;
        this.imageUrl2 = imageUrl2;
        this.imageUrl3 = imageUrl3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImageUrl1() {
        return imageUrl1;
    }

    public void setImageUrl1(Integer imageUrl1) {
        this.imageUrl1 = imageUrl1;
    }

    public Integer getImageUrl2() {
        return imageUrl2;
    }

    public void setImageUrl2(Integer imageUrl2) {
        this.imageUrl2 = imageUrl2;
    }

    public Integer getImageUrl3() {
        return imageUrl3;
    }

    public void setImageUrl3(Integer imageUrl3) {
        this.imageUrl3 = imageUrl3;
    }
}

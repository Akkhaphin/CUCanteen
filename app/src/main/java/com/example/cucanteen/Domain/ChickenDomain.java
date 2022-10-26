package com.example.cucanteen.Domain;

public class ChickenDomain {

    String nameFoodChicken;
    String caption1;
    String caption2;
    String Price;
    Integer imgchicken;
    Integer imgchickenBG;

    public ChickenDomain(String nameFoodChicken, String caption1, String caption2, String price, Integer imgchicken, Integer imgchickenBG) {
        this.nameFoodChicken = nameFoodChicken;
        this.caption1 = caption1;
        this.caption2 = caption2;
        Price = price;
        this.imgchicken = imgchicken;
        this.imgchickenBG = imgchickenBG;
    }


    public String getNameFoodChicken() {
        return nameFoodChicken;
    }

    public void setNameFoodChicken(String nameFoodChicken) {
        this.nameFoodChicken = nameFoodChicken;
    }

    public String getCaption1() {
        return caption1;
    }

    public void setCaption1(String caption1) {
        this.caption1 = caption1;
    }

    public String getCaption2() {
        return caption2;
    }

    public void setCaption2(String caption2) {
        this.caption2 = caption2;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public Integer getImgchicken() {
        return imgchicken;
    }

    public void setImgchicken(Integer imgchicken) {
        this.imgchicken = imgchicken;
    }

    public Integer getImgchickenBG() {
        return imgchickenBG;
    }

    public void setImgchickenBG(Integer imgchickenBG) {
        this.imgchickenBG = imgchickenBG;
    }
}

package com.example.cucanteen.Domain;

public class IcanteenDomain {

    String name;
    String menu1;
    String menu2;
    String menu3;
    String menu4;
    Integer img;
    Integer imgBg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMenu1() {
        return menu1;
    }

    public void setMenu1(String menu1) {
        this.menu1 = menu1;
    }

    public String getMenu2() {
        return menu2;
    }

    public void setMenu2(String menu2) {
        this.menu2 = menu2;
    }

    public String getMenu3() {
        return menu3;
    }

    public void setMenu3(String menu3) {
        this.menu3 = menu3;
    }

    public String getMenu4() {
        return menu4;
    }

    public void setMenu4(String menu4) {
        this.menu4 = menu4;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public Integer getImgBg() {
        return imgBg;
    }

    public void setImgBg(Integer imgBg) {
        this.imgBg = imgBg;
    }

    public IcanteenDomain(String name, String menu1, String menu2, String menu3, String menu4, Integer img, Integer imgBg) {
        this.name = name;
        this.menu1 = menu1;
        this.menu2 = menu2;
        this.menu3 = menu3;
        this.menu4 = menu4;
        this.img = img;
        this.imgBg = imgBg;
    }
}

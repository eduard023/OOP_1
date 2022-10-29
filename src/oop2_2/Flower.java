package oop2_2;

public class Flower {
    private String flowerColor;
    private String country;
    private double coast;
    public int lifeSpan;

    public Flower(String flowerColor, String country, double coast, int lifeSpan) {
        if (flowerColor == null){
            this.flowerColor = "белый";
        }else {
            this.flowerColor = flowerColor;
        }
        if (country == null){
            this.country = "Россия";
        }else {
            this.country = country;
        } if (coast <= 0){
            this.coast = 1;
        }else {
            this.coast = coast;
        }
        if (lifeSpan < 0 ){
            this.lifeSpan = 3;
        }else {
            this.lifeSpan = lifeSpan;
        }
    }
    public Flower(String flowerColor, String country, double coast){
        this(flowerColor, country, coast, 3);
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null){
            this.flowerColor = "белый";
        }else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null){
            this.country = "Россия";
        }else {
            this.country = country;
        }
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double coast) {
        this.coast = coast;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
}

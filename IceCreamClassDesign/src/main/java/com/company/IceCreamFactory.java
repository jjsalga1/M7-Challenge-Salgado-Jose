package com.company;

public class IceCreamFactory {
    String flavor;
    String[] ingredients;
    String packaging;
    int size;
    String expiration;
    double price;

    public IceCreamFactory(String flavor, String[] ingredients, String packaging, int size, String expiration, double price) {
        this.flavor = flavor;
        this.ingredients = ingredients;
        this.packaging = packaging;
        this.size = size;
        this.expiration = expiration;
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

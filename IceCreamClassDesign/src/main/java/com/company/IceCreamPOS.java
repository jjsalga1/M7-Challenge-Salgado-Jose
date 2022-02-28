package com.company;

public class IceCreamPOS {
    String size;
    String container;
    String flavor;
    String[] toppings;
    double price;

    public IceCreamPOS(String size, String container, String flavor, String[] toppings, double price) {
        this.size = size;
        this.container = container;
        this.flavor = flavor;
        this.toppings = toppings;
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

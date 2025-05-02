package app;

import java.awt.print.Printable;

public class Cake implements ProductMethods {
    String flavour;
    String vegetarian;
    double price;

    public Cake(String flavour, String vegetarian, double price) {
        this.flavour = flavour;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getFlavour() {
        return flavour;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getType() {
        return vegetarian;
    }
}

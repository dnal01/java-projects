package app;

import java.awt.print.Printable;

public class Cake implements ProductMethods {
    String flavour;
    boolean vegetarian;
    double price;
    Cake(String flavour, boolean vegetarian, double price) {
        this.flavour = flavour;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public double getFlavour() {
        return 0;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getType() {
        return "";
    }
}

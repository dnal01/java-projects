package app;

import java.util.ArrayList;

public class appController {
    public String getProduct(String cmdInput, ArrayList<Cake> cakes) {
        for (Cake cake : cakes) {

            if (cake.getFlavour().contains(cmdInput) || cake.getType().contains(cmdInput)) {
                return cake.getName() + " " + cake.getType();
            }
        }
        return null;
    }
}

package app;

import java.util.List;

public class appController {
    public String getProduct(String cmdInput, List<Cake> cakes) {
        for (Cake cake : cakes) {

            if (cake.getFlavour().contains(cmdInput) || cake.getType().contains(cmdInput)) {
                return cake.getFlavour() + " " + cake.getType();
            }
        }
        return null;
    }
}

package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cake cake = new Cake("Cinnamon", "V", 2.00);
        Cake cake2 = new Cake("Berry", "V", 3.50);
        Cake cake3 = new Cake("Chocolate", "NV", 6.00);
        List<Cake> cakes = new ArrayList<>();
        cakes.add(cake);
        cakes.add(cake2);
        cakes.add(cake3);
        boolean orderCompleted = false;
        Scanner sc = new Scanner(System.in);
        while (!orderCompleted) {
            System.out.println("Please make your choice (flavour or Vegan type (V / NV) : ");
            String cmdInput = sc.nextLine();
            appController appController = new appController();
            String selection = appController.getProduct(cmdInput, cakes);
            System.out.println("You have selected : ");

            System.out.println("Do you want to order more? (y/n) : ");
            cmdInput = sc.nextLine();
            if (cmdInput.equals("y")) {
                orderCompleted = true;
            }
        }
    }
}
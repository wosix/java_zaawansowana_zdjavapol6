package PizzaBakery;

import java.time.LocalTime;
import java.util.Scanner;

public class PizzaFactory {
    private Scanner scanner = new Scanner(System.in);
    private Pizza pizza;
    private int credits = 50;

    public void greeting() {
        System.out.println("\nWelcome to Pizza Factory!!!\n");
        System.out.println("If you would like to see the menu - press enter.");
        String wait = scanner.nextLine();
        menu();
        order();
    }


    public void menu() {
        PizzaType pizzaType = null;
        System.out.println("That's our todays menu:");
        System.out.println("1. " + pizzaType.MARGHERITA.toString() + " 16-, ");
        System.out.println("2. " + pizzaType.CAPRICCIOSA.toString() + " 18-, ");
        System.out.println("3. " + pizzaType.PEPPERONI.toString() + " 20-, ");
    }

    private void orderOrExit() {
        System.out.println("Would you like to order or exit?");
        String operation = scanner.nextLine();
        switch (operation) {
            case "order":
                order();
                break;
            case "exit":
                return;
        }
    }

    private void order() {
        System.out.print("Type number of pizza you want: ");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                canOrder(16, PizzaType.MARGHERITA);
            case 2:
                canOrder(18, PizzaType.CAPRICCIOSA);
            case 3:
                canOrder(20, PizzaType.PEPPERONI);
        }
    }

    private void canOrder(int cost, PizzaType type) {
        if (0 > credits - cost) {
            System.out.println("Sorry, you doesn't have enough credits :(");
            orderOrExit();
        } else if (0 < credits - cost) {
            credits =- cost;
            bake(type);
            isEnough();
        }
    }

    private void isEnough() {
        System.out.println("\nDo you have enough? Or would you like to order more?");
        String operation = scanner.nextLine();
        switch (operation) {
            case "more":
                menu();
                order();
                break;
        }
    }

    public void bake(PizzaType type) {
        Pizza pizza = type.makePizza();
        System.out.println("\nBaked " + type.toString().toLowerCase() + " pizza! " + pizza.toString());
    }


}

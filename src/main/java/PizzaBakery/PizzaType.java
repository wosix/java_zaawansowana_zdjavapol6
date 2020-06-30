package PizzaBakery;

import java.util.ArrayList;
import java.util.List;

public enum  PizzaType {
    MARGHERITA(){
        @Override
        public Pizza makePizza(){
            Pizza pizza = new Pizza();
            pizza.addIngredient("dough");
            pizza.addIngredient("sauce");
            pizza.addIngredient("mozzarella");
            return pizza;
        }
    },
    CAPRICCIOSA(){
        @Override
        public Pizza makePizza(){
            Pizza pizza = new Pizza();
            pizza.addIngredient("dough");
            pizza.addIngredient("sauce");
            pizza.addIngredient("mozzarella");
            pizza.addIngredient("pieczarkas");
            return pizza;
        }
    },
    PEPPERONI(){
        @Override
        public Pizza makePizza(){
            Pizza pizza = new Pizza();
            pizza.addIngredient("dough");
            pizza.addIngredient("sauce");
            pizza.addIngredient("mozzarella");
            pizza.addIngredient("pepperoni");
            return pizza;
        }
    };

    abstract Pizza makePizza();

}

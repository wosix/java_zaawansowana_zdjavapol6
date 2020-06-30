package PizzaBakery;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    public List<String> ingredients = new ArrayList<>();

    public Pizza (List<String> ingredients){
        this.ingredients = ingredients;
    }

    public Pizza() {

    }

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "ingredients=" + ingredients +
                '}';
    }
}

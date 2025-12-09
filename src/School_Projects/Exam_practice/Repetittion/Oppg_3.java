package School_Projects.Exam_practice.Repetittion;

import java.util.ArrayList;

public class Oppg_3 {
    public static void main(String[] args) {

        Ingredient flour = new Ingredient("Flour", 1.5, "dl");
        Ingredient Milk = new Ingredient("Milk", 1.0, "dl");
        Ingredient Egg = new Ingredient("Egg", 2, "stk");
        Ingredient salt = new Ingredient("Salt", 1, "pinch");

        ArrayList<Ingredient> list = new ArrayList<>();
        list.add(flour);
        list.add(Milk);
        list.add(Egg);
        list.add(salt);


        FoodDish newDish = new FoodDish("Pannekaker");
        newDish.addIngredient(list);

        newDish.printRecipe();
        newDish.serveDish();
    }
}

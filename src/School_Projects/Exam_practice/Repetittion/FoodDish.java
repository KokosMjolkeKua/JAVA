package School_Projects.Exam_practice.Repetittion;

import java.util.ArrayList;

public class FoodDish{
    private String name;
    private ArrayList<Ingredient> ingredient = new ArrayList<>();
    private int dishesServed = 0;

    public FoodDish(String name){
        this.name = name;
    }

    public void addIngredient(ArrayList<Ingredient> ingredient){
        this.ingredient = ingredient;
    }

    public void printRecipe(){
        System.out.println("Dish-Name: " + name +
                "\nIngredients: " + ingredient);
    }

    public void serveDish(){
        dishesServed ++;
        System.out.println("The dish has been served!");
    }
}

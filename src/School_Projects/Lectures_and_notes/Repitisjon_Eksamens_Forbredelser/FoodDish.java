package School_Projects.Lectures_and_notes.Repitisjon_Eksamens_Forbredelser;

import java.util.ArrayList;

public class FoodDish{
    private String nameDish;
    private ArrayList<Ingredient> ingredients;

    public FoodDish(String nameDish) {
        this.nameDish = nameDish;
        this.ingredients = new ArrayList<Ingredient>();
    }

    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    public void printRecipe(){
        System.out.println(nameDish + " Oppskrift");
        for (Ingredient ingredient: ingredients){
            System.out.println(ingredient);
        }
    }

}

package School_Projects.Lectures_and_notes.Repitisjon_Eksamens_Forbredelser;

public class Oppg3 {
    public static void main(String[]args){
        FoodDish pancakes = new FoodDish("Pannekake");
        pancakes.addIngredient(new Ingredient("Mel", 1, "dl"));
        pancakes.addIngredient(new Ingredient("Melk", 3, "dl"));
        pancakes.addIngredient(new Ingredient("Egg", 2, "stk"));
        pancakes.addIngredient(new Ingredient("Salt", 1, "te-skje"));

        pancakes.printRecipe();
    }
}

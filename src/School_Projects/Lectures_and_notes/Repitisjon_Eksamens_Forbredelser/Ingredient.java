package School_Projects.Lectures_and_notes.Repitisjon_Eksamens_Forbredelser;

public class Ingredient {
    private String name;
    private double Amount;
    private String unit;

    public Ingredient(String name, double Amount, String unit){
        this.name = name;
        this.Amount = Amount;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "\nIngredient:" +
                "\nName: " + name +
                "\nAmount: " + Amount +
                "\nUnit: " + unit;
    }
}

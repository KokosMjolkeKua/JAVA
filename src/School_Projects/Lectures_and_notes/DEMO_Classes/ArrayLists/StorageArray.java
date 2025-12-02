package School_Projects.Lectures_and_notes.DEMO_Classes.ArrayLists;

public class StorageArray {
    String[] fruitArray = new String[5];
    int count = 0;

    public void addFruit(String fruitProduct){
        fruitArray[count++] = fruitProduct;
    }

    public void printFruit(){
        for (String s: fruitArray){
            System.out.println("Fruit: " + s);
        }
    }
}

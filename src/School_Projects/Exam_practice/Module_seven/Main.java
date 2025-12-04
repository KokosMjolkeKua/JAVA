package School_Projects.Exam_practice.Module_seven;

import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[]args){

        ArrayList_testing items = new ArrayList_testing();

        showMessageDialog(null, "Please add Items: ");
        items.addItem("Potatoes");
        items.addItem("Brokkoli");
        items.addItem("Cauliflower");

//        items.addItem(showInputDialog("Add an item to cart: "));
//        items.addItem(showInputDialog("Add an item to cart: "));
//        items.addItem(showInputDialog("Add an item to cart: "));
//        items.addItem(showInputDialog("Add an item to cart: "));
//        items.addItem(showInputDialog("Add an item to cart: "));
//        items.addItem(showInputDialog("Add an item to cart: "));
//
//        items.printItem();



        Animal animal = new Animal();
        animal.addAnimal("Tiger", 3);
        animal.addAnimal("Lion", 2);
        animal.addAnimal("Giraffe", 5);
        animal.addAnimal("Hippo", 1);
        animal.addAnimal("Rabbit", 3);

        animal.printAnimal();
    }
}

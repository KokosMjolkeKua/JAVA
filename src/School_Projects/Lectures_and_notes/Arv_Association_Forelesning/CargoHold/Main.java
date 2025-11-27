package School_Projects.Lectures_and_notes.Arv_Association_Forelesning.CargoHold;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args){

        ArrayList<Animal> animalCargoList = new ArrayList<Animal>();

        //ArrayList<Cat> catList = new ArrayList<Cat>();
        //ArrayList<Dog> dogList = new ArrayList<Dog>();

        Cat cat1 = new Cat(40, 20, 10, 7);
        //double catWeight = cat.getWeight();
        //System.out.println("Katten veier " + catWeight + " kg!");
        //cat.makeSound();

        //Animal catAnimal = cat;
        //på neste linje kan man enten skrive dette over, eller bare cat

        animalCargoList.add(cat1);

        animalCargoList.add(new Dog(50, 20, 30, 10));  //kan adde direkte!!
        animalCargoList.add(new Cat(20, 10, 30, 10));

        cat1.tipGlassOfShelf();

        Animal dogAnimal = animalCargoList.get(1);

        //Dog dog2 = (Dog) dogAnimal;
        //dog2.sniffOutTarget("\nTrym's sokker");

        for(Animal animal : animalCargoList){
            System.out.println(animal);
            animal.makeSound();

            switch (animal){
                case Cat cat -> cat.tipGlassOfShelf();
                case Dog dog -> dog.sniffOutTarget("Trym's Sokker");
                default -> animal.makeSound();
            }

        }

        Baggage myBaggage = new Baggage(20, 20, 10, 30);
        //Dimensions myBageDimensions = myBaggage.getDimensions();//myBageDimensions.getVolume();
        //myBageDimensions.setWeight(100);

    }
}

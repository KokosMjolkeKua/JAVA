package School_Projects.Exam_practice.Module_five.O_1;

public class Main {
    public static void main(String[]args){
        Room livingR = new Room("Living Room", 5.0, 3.8);
        Room bathR = new Room("Bathroom", 1.6, 2.2);
        Room entre = new Room("Entre", 1.6, 3.8);
        Room kitchen = new Room("Kitchen", 3.3, 2.4);
        Room bedR = new Room("Bedroom", 3.3, 3.9);

        Room[] rooms = {livingR, bathR, entre, kitchen, bedR};

        double totalAreal = 0;
        for(Room s: rooms){
            totalAreal = totalAreal + s.areal;
        }
        if(totalAreal > 52){
            System.out.println("The Areal exceeds the total amount of areal allowed for this apartment");
        }
        if(totalAreal < 51){
//            Apartment A6 = new Apartment(new String[]{livingR.toString(), bathR.toString(), entre.toString(), kitchen.toString(), bedR.toString()});
            Apartment A2 = new Apartment(rooms);
        }


    }
}

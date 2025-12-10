package School_Projects.Exam_practice.Module_five.O_5;

public class Main {
    public static void main(String[]args){
        Ticket ida = new Ticket("Ida", "Svalbard", 1223122312);
        ida.checkPrice();
        ida.buyTicket(675423182);
        System.out.println();
        ida.printTicket();

        System.out.println();

        Ticket tord = new Ticket("Tord", "Svalbard", 1222342312);
        tord.checkPrice();
        tord.buyTicket(675423182);
        System.out.println();
        tord.printTicket();

        System.out.println();

        Ticket niels = new Ticket("Niels", "Svalbard", 986234613);
        niels.checkPrice();
        niels.buyTicket(675423182);
        System.out.println();
        niels.printTicket();
        System.out.println();


        Ticket oskar = new Ticket("Oskar", "Svalbard", 1231231231);
        Ticket tora = new Ticket("Tora", "Svalbard", 1231231231);
        Ticket ketil = new Ticket("Ketil", "Svalbard", 1231231231);
        Ticket lasse = new Ticket("Lasse", "Svalbard", 1231231231);
        Ticket trym = new Ticket("Trym", "Svalbard", 1231231231);
        Ticket hakon = new Ticket("Håkon", "Svalbard", 1231231231);


        Ticket[] tickets = {oskar, tora, ketil, lasse, trym, hakon};
        for(Ticket t: tickets){
            t.printTicket();
            System.out.println();
        }
    }
}

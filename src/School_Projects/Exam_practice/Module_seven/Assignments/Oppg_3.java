package School_Projects.Exam_practice.Module_seven.Assignments;

public class Oppg_3 {
    public static void main(String[]args){

        String[] nameList = {"Per", "Hansen", "Line", "Olsen", "Ola", "Pedersen", "Kari", "Finnsen"};

        for (int i = 0; i < nameList.length; i += 2) {
            System.out.println(nameList[i] + " " + nameList[i + 1]);
        }
        System.out.println("\n" + nameList[0] + " " + nameList[1]);
        System.out.println(nameList[2] + " " + nameList[3]);
        System.out.println(nameList[4] + " " + nameList[5]);
        System.out.println(nameList[6] + " " + nameList[7]);
    }
}

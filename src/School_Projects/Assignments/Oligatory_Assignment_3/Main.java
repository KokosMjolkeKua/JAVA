package School_Projects.Assignments.Oligatory_Assignment_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    /**
     * Use this main method to call the methods implemented
     * in the Assignment class.
     */
    public static void main(String[] args) {
	    Assignment assignment = new Assignment();
	    // Use the assignment reference to call methods, like this:
        //a)
        System.out.println(assignment.addThreeNumbers(2,3,4));
        //b)
        System.out.println(assignment.isNumberSmallMediumOrBig(123));
        System.out.println(assignment.isNumberSmallMediumOrBig(13));
        System.out.println(assignment.isNumberSmallMediumOrBig(1230));
        //c)
        assignment.printCourseName("ADTS1600");
        assignment.printCourseName("DAPE1400");
        assignment.printCourseName("DATA1200");
        assignment.printCourseName("DATA1100");
        assignment.printCourseName("klj");
        //d)
        assignment.isColorInNorwegianFlag("blue");
        assignment.isColorInNorwegianFlag("RED");
        assignment.isColorInNorwegianFlag("yellow");
        assignment.isColorInNorwegianFlag("white");

        System.out.println(assignment.combinedLength("455", "6786"));

        System.out.println(assignment.checkIfStringIsWithinCorrectLength("fack you", 6865, 68));
        System.out.println(assignment.checkIfStringIsWithinCorrectLength("457", 3, 3));
        //e)
        assignment.printAllStrings(new String[]{"Coding", "is", "fun!"});

        System.out.println(assignment.arraySum(new int[]{2,3,4,5,6}));

        assignment.printAllStringsNotCorona(new String[]{"Corona", "Coors", "Beerclaw", "Corona", "Frydenlund"});
        //f)
        System.out.println(assignment.findAllIntsBelowNumberInArray(new int[]{72,83,45,95}, 78));
        System.out.println(assignment.findAllIntsBelowNumberInArray(new int[]{72,853,45,95}, 455));

        System.out.println(assignment.makeHashMapFromTwoArrays(new String[]{"Hi", "bye", "good-day", "die"}, new String[]{"hello", "to", "you", "mohahah"}));
        System.out.println(assignment.makeHashMapFromTwoArrays(new String[]{"A", "B", "C", "D"}, new String[]{"a", "b", "c", "d"}));


        String[] testStrings = {"A", "B", "C", "D", "B", "D"};
        ArrayList list = new ArrayList <>(Arrays.asList(testStrings));
        HashMap gjentagelse = assignment.findFrequencyOfElementsInArrayListOfStrings(list);
        System.out.println("A:" + gjentagelse.get("A"));
        System.out.println("B:" + gjentagelse.get("B"));
        System.out.println("C:" + gjentagelse.get("C"));
        System.out.println("D:" + gjentagelse.get("D"));

        //Extra-Assignments)


    }
}

package School_Projects.Assignments.Oligatory_Assignment_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Assignment {
    // a) Metoder
    /**
     * Returns the sum of all the received numbers.
     */
    public int addThreeNumbers(int i, int j, int k) {

        return i + j + k;
    }


    // b) if else
    /**
     * Evaluates if the received number is
     * Small (less than 100).
     * Big (greater than 1000).
     * Medium (not small or big)
     */
    public String isNumberSmallMediumOrBig(int number){
        if (number < 100){
            return "Small";
        }
        else if(number > 1000){
            return "Big";
        }
        else{
            return "Medium";
        }
    }

    // c) switch
    /**
     * Prints course name for provided course code.
     * ADTS1600 -> Interaksjonsdesign og Prototyping
     * DAPE1400 -> Programmering
     * DATA1200 -> Webutvikling og inkluderende design
     * DATA1100 -> Teknologi og samfunn for programmerere
     * or "Unknown" if none of the above.
     */
    public void printCourseName(String courseCode){
        switch(courseCode){
            case "ADTS1600":
                System.out.println("Interaksjonsdesign og Prototyping");
                break;
            case "DAPE1400":
                System.out.println("Programmering");
                break;
            case "DATA1200":
                System.out.println("Webutvikling og inkluderende design");
                break;
            case "DATA1100":
                System.out.println("Teknologi og samfunn for programmerere");
                break;
            default:
                System.out.println("Unknown");
                break;

        }

    }

    // d) Strings
    /**
     * Returns true if provided color is represented in the Norwegian flag.
     * Color input is lowercase only.
     */
    public boolean isColorInNorwegianFlag(String color){
        String c = color.toLowerCase();
        if(c.equals("white") || c.equals("red") || c.equals("blue")){
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("False");
            return false;
        }
    }

    /**
     * Returns the combined length of the provided Strings.
     */
    public int combinedLength(String s1, String s2){
        int sum = s1.length() + s2.length();
        return sum;
    }


    /**
     * Return true if string is shorter than or equal to maxChar characters and longer then or equal to minChar characters.
     * hint: https://www.w3schools.com/java/ref_string_length.asp
     */
    public Boolean checkIfStringIsWithinCorrectLength(String string, int maxChar, int minChar){
        int length = string.length();
        return length <= maxChar && length >= minChar;
    }


    // e) Arrays
    /**
     * Prints all Strings in received array using System.out.println.
     * One String on each line.
     */
    public void printAllStrings(String[] strings){
        for(String all: strings){
            System.out.println(all);
        }

    }


    /**
     * Returns the sum of all numbers in received array.
     */
    public int arraySum(int[] numbers){
        int sum = 0;
        for (int i: numbers){
            sum += i;
        }
        return sum;
    }

    /**
     * Prints all Strings in received array using System.out.println.
     * One String on each line.
     * But only if the String is not exactly "Corona".
     */
    public void printAllStringsNotCorona(String[] strings){
        for (String s: strings){
            if (!s.equals("Corona")){
                System.out.println(s);
            }
        }

    }

    // f) Collections
    /**
     * Finds all integers lower than a given number and stores these in an ArrayList
     */
    public ArrayList<Integer> findAllIntsBelowNumberInArray(int[] integerArray, int number) {
        ArrayList<Integer> all = new ArrayList<>();
        for (int i: integerArray){
            if(number > i){
                all.add(i);
            }
        }
        return all;
    }

    /**
     * Inputs two arrays and maps the elements in the keyArrays to the elements in the valueArrau
     * in a hashmap and returns this HashMap
     */
    public HashMap<String, String> makeHashMapFromTwoArrays(String[] keyArray, String[] valueArray) {
        HashMap<String, String> result = new HashMap<>();
        for(int s = 0; s < keyArray.length; s++){
            result.put(keyArray[s], valueArray[s]);
        }
        return result;
    }

    /**
     * Find the frequency of occurences of each element in the parameter array (stringArray)
     * and store the frequency of each element in the array as a key value pair in a HashMap
     * with the element as key and frequency as value
     */

    public HashMap<String, Integer> findFrequencyOfElementsInArrayListOfStrings(ArrayList<String> stringList) {
        //HashMap<String, Integer> newHashMap = new HashMap<>();
        //for (String element : stringList) {
        //    newHashMap.put(element, newHashMap.getOrDefault(element, 0) + 1);
        //}

        //return newHashMap;

        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<Integer> occurance = new ArrayList<>();

        for(int i = 0; i < stringList.toArray().length; i++){
            int newOccurance = Collections.frequency(stringList, stringList.toArray()[i]);
            occurance.add(newOccurance);
        }
        for(int i = 0; i < stringList.toArray().length; i++){
            int value = Integer.parseInt(occurance.toArray()[i].toString());
            map.put(stringList.toArray()[i].toString(), value);
        }
        return map;
    }


    // The following methods are Optional assignments:
    // additional optional assignments might be added later.


    /**
     * Returns the index of the first occurrence of char c in String string.
     * Returns -1 if char is not found.
     * Tips: google er din venn
     */
    public int firstOccurrence(String string, char c){
        return 0;
    }

    /**
     * Returns the string with out starting spaces only a single trailing space at the end
     * hint: https://www.w3schools.com/java/ref_string_trim.asp
     */
    public String ensureOnlySingleSpaceAtEndOfString(String string){
        return string;
    }

    /**
     * Return True if the string is valid under the following conditions:
     * Only single trailing spaces
     * No starting spaces
     * Must be longer or equal to 6 characters
     * Must be shorter or equal to 60 characters
     * Hint: Maybe its possible to reuse previous methods for this task?
     */
    public Boolean validateString(String string){
        return false;
    }


    /**
     * Prints the provided strings in upper case letters.
     * One String on each line.
     */
    public void printUpperCaseStrings(String[] strings){

    }

    /**
     * Print all characters until a char is "."
     * including the .
     * Do not print in separate lines.
     */
    public void printFirstSentence(char[] chars) {

    }
    
    /**
     * Prints all Strings in received array to standard output.
     * One String on each line.
     * But only if the String is not Corona (case-insensitive).
     */
    public void printAllStringsNotCoronaCaseInsensitive(String[] strings){

    }

    /**
     * Returns the sum of all the received numbers.
     * hint: this is called varargs
     */
    public int addNumbers(int... numbers){
        return 0;
    }
}

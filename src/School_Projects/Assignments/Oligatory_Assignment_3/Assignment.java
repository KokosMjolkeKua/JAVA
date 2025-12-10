package School_Projects.Assignments.Oligatory_Assignment_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class Assignment{
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
        if(number < 100){
            return "Small";
        }
        if(number > 1000){
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
        if(color.equalsIgnoreCase("blue") ||
                color.equalsIgnoreCase("white") ||
                color.equalsIgnoreCase("red")){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Returns the combined length of the provided Strings.
     */
    public int combinedLength(String s1, String s2){
        return s1.length() + s2.length();
    }


    /**
     * Return true if string is shorter than or equal to maxChar characters and longer then or equal to minChar characters.
     * hint: https://www.w3schools.com/java/ref_string_length.asp
     */
    public Boolean checkIfStringIsWithinCorrectLength(String string, int maxChar, int minChar){
        if(string.length() <= maxChar && string.length() >= minChar){
            return true;
        }
        else{
            return false;
        }
    }


    // e) Arrays
    /**
     * Prints all Strings in received array using System.out.println.
     * One String on each line.
     */
    public void printAllStrings(String[] strings){
        for(String s: strings){
            System.out.println(s);
        }
    }


    /**
     * Returns the sum of all numbers in received array.
     */
    public int arraySum(int[] numbers){
        int sum = 0;
        for(int i: numbers){
            sum = i + sum;
        }
        return sum;
    }

    /**
     * Prints all Strings in received array using System.out.println.
     * One String on each line.
     * But only if the String is not exactly "Corona".
     */
    public void printAllStringsNotCorona(String[] strings){
        for (int i = 0; i < strings.length; i++) {
            if(!strings[i].contains("Corona")){
                System.out.println(strings[i]);
            }
        }
    }

    // f) Collections
    /**
     * Finds all integers lower than a given number and stores these in an ArrayList
     */
    public ArrayList<Integer> findAllIntsBelowNumberInArray(int[] integerArray, int number) {
        ArrayList<Integer> lowIntegers = new ArrayList<>();
        for(int i: integerArray){
            if(i < number){
                lowIntegers.add(i);
            }
        }
        return lowIntegers;
    }

    /**
     * Inputs two arrays and maps the elements in the keyArrays to the elements in the valueArrau
     * in a hashmap and returns this HashMap
     */
    public HashMap<String, String> makeHashMapFromTwoArrays(String[] keyArray, String[] valueArray) {
        HashMap<String, String> hashMap = new HashMap<>();

        for (int i = 0; i < keyArray.length; i++) {
            hashMap.put(keyArray[i], valueArray[i]);
        }

        return hashMap;
    }

    /**
     * Find the frequency of occurences of each element in the parameter array (stringArray)
     * and store the frequency of each element in the array as a key value pair in a HashMap
     * with the element as key and frequency as value
     */

    public HashMap<String, Integer> findFrequencyOfElementsInArrayListOfStrings(ArrayList<String> stringList) {
        HashMap<String, Integer> frequency = new HashMap<>();
        for(String s: stringList){
            if(frequency.containsKey(s)){
                frequency.put(s, frequency.get(s) + 1);
            }
            else{
                frequency.put(s, 1);
            }
        }
        return frequency;
    }


    // The following methods are Optional assignments:
    // additional optional assignments might be added later.


    /**
     * Returns the index of the first occurrence of char c in String string.
     * Returns -1 if char is not found.
     * Tips: google er din venn
     */
    public int firstOccurrence(String string, char c){
        return string.indexOf(c);
    }

    /**
     * Returns the string with out starting spaces only a single trailing space at the end
     * hint: https://www.w3schools.com/java/ref_string_trim.asp
     */
    public String ensureOnlySingleSpaceAtEndOfString(String string){
        return string.trim();
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
        if(!string.contains("  ") && !string.startsWith(" ")
                && string.length() >= 6 && string.length() <= 60){
            return true;
        }
        else{
            return false;
        }
    }


    /**
     * Prints the provided strings in upper case letters.
     * One String on each line.
     */
    public void printUpperCaseStrings(String[] strings){
        for(String s: strings){
            System.out.println(s.toUpperCase());
        }
    }

    /**
     * Print all characters until a char is "."
     * including the .
     * Do not print in separate lines.
     */
    public void printFirstSentence(char[] chars) {
        boolean yes = true;
        while(yes){
            for(char c: chars){
                if((c == '.')){
                    System.out.println(c);
                    yes = false;
                }
                System.out.println(c + " ");
            }
        }

    }

    /**
     * Prints all Strings in received array to standard output.
     * One String on each line.
     * But only if the String is not Corona (case insensitive).
     */
    public void printAllStringsNotCoronaCaseInsensitive(String[] strings){
        for(String s: strings){
            if(!s.contains("Corona")){
                System.out.println(s);
            }
            if(s.contains("Corona")){
                System.out.println("case insensitive");
            }
        }
    }

    /**
     * Returns the sum of all the received numbers.
     * hint: this is called varargs
     */
    public int addNumbers(int... numbers){
        int sum = 0;
        for (var v: numbers){
            sum = v + sum;
        }
        return sum;
    }
}

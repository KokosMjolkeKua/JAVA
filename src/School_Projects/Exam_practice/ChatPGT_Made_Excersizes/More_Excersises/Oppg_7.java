package School_Projects.Exam_practice.ChatPGT_Made_Excersizes.More_Excersises;

import java.util.Arrays;

public class Oppg_7 {
    public static void main(String[]args){
        int[][] t = {{1,2},{3,4},{5,6}};
        System.out.println(t[0][0] + " " + t[0][1] + " " + t[1][0]);
        System.out.println(t[1][1] + " " + t[2][0] + " " + t[2][1]);


        int[][] e = {{1,2,3,4,5},{3,4},{5}};
        System.out.println(e[0][4] + " " + e[2][0]);

        String[][] s = {{"Hei", "på"},{"deg","tuppa"},{"er","på"},{"tur", "idag"}};
        System.out.println(s[0][0] + " " + s[0][1] + " " + s[1][0]);
        System.out.println(s[3][0] + " " + s[3][1] + "?");

        int[][][] i = {{{1, 4, 5}},{{2, 4, 5}},{{3, 4, 5}}};
        System.out.println(Arrays.deepToString(i));
    }
}

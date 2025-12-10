package School_Projects.Exam_practice.Scratch_Programs;

public class WhileLoop {
    public static void main(String[]args){
        char[] charList = {'A', 'B', 'C', 'D'};
        int i = charList.length - 1;
        while(i >= 0){
            System.out.print(charList[i] + " ");
            i --;

            if(i < 0){
                System.out.println();
            }
        }

        int e = 0;
        while(e < charList.length){
            System.out.print(charList[e] + " ");
            e++;
        }
    }
}

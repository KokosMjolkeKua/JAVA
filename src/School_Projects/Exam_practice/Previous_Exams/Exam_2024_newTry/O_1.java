package School_Projects.Exam_practice.Previous_Exams.Exam_2024_newTry;

public class O_1 {

    public void investigateIntArray(int[] ints, int number){
        int sum = 0;
        int max = ints[0];
        System.out.println("Alle tall mindre enn 0:");

        //Jeg har gjort dette i 2 for løkker fordi det ser mer ryddig ut.
        //Men man kan gjøre dette i en for løkke
        //Eks:
//        for(int i: ints){
//            if (i < 0) {
//                System.out.println(i + " er ett tall mindre enn 0.");
//            }
//            if(max < i){
//                max = i;
//            }
//            sum = sum + i;
//
//            if(i%number == 0){
//                System.out.println(i + " er delelig med " + number + ".");
//            }
//        }

        for(int i: ints) {
            if (i < 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for(int i: ints){
            if(max < i){
                max = i;
            }
            sum = sum + i;

            if(i%number == 0){
                System.out.println(i + " er delelig med " + number + ".");
            }
        }
        System.out.println();
        System.out.println("Det største tallet i tallrekken: " + max);
        System.out.println("Summen av alle tallene er: " + sum);
    }

}

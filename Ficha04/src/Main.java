public class Main{
    public static void main(String[] args) {

        final int[] studentNumbers = {20032, 30312, 25342, 31432};
        final String[] courseAcronyms = {"AD", "WEB-FE", "WEB-BE"};
        final int[][] studentGrades = {
                {15, 18, 17},
                {18, 10, 11},  //grades of student 30312
                {11, 13, 15},
                {10, 19, 16},

        };
        //System.out.println("O aluno " + studentNumbers[0] + " teve as seguintes notas: \n \t" + courseAcronyms[0] + ": " + studentGrades[0][0] + "\n \t" + courseAcronyms[1] + ": " + studentGrades[0][1] + "\n \t" + courseAcronyms[2] + ": " + studentGrades[0][2]);
        for (int i = 0; i < studentNumbers.length ; i++) {
            StringBuilder msg = new StringBuilder("O aluno " + studentNumbers[i] + " teve as seguintes notas: \n");
            for (int j = 0; j < courseAcronyms.length ; j++) {
                msg.append("\t").append(courseAcronyms[j]).append(": ").append(studentGrades[i][j]).append("\n");
            }
            System.out.println(msg);
        }

    }

}
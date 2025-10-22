import org.w3c.dom.ls.LSOutput;
import pt.uma.tpsi.ad.utils.MatrixUtilities;
import pt.uma.tpsi.ad.utils.CharacterDrawingUtilities;

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

        int[][] matrix = {
                {1, 2, 3},
                {9, 2, 3},
                {8, 7, 3},
        };
        int[][] matrix2 = {
                {1, 4},
                {3, 4, 5},
                {1, 2}
        };
        int[][] matrixToSum = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1},
        };

        MatrixUtilities.show(matrix);
        System.out.println("É matriz: " + MatrixUtilities.isMatrix(matrix2));
        System.out.println("É identidade: " + MatrixUtilities.isIdentity(matrix));
        System.out.println("Multiplicaçao: \n");
        MatrixUtilities.show(MatrixUtilities.multiplyBy(matrix2, 4));
        System.out.println(MatrixUtilities.areCompatibleForSum(matrix, matrix2));
        System.out.println("Soma: \n");
        MatrixUtilities.show(MatrixUtilities.sumOf(matrix, matrixToSum));
        //CharacterDrawingUtilities.drawHorizontalSegmentWith(5, '*');
        //CharacterDrawingUtilities.drawFilledRectangleWith(5, 5, '*');
        CharacterDrawingUtilities.drawEmptyRectangleWith(5, 5, '*');

    }
}
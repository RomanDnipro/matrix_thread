import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int lines1 = 0;
        int column1 = 0;
        int lines2 = 0;
        int column2 = 0;
        int boundForRand = 10;

        do {
            System.out.println("Columns of 1st matrix should be equal to Lines of 2nd matrix");
            System.out.println("Enter quantity of Lines 1st matrix:");
            lines1 = Integer.parseInt(sc.nextLine());
            System.out.println("Enter quantity of Columns 1st matrix:");
            column1 = Integer.parseInt(sc.nextLine());
            System.out.println("Enter quantity of Lines 2st matrix:");
            lines2 = Integer.parseInt(sc.nextLine());
            System.out.println("Enter quantity of Columns 2st matrix:");
            column2 = Integer.parseInt(sc.nextLine());
        }while (column1 != lines2);

        int[][] matrix1 = new int[lines1][column1];
        int[][] matrix2 = new int[lines2][column2];
        int[][] res = new int[lines1][column2];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = random.nextInt(boundForRand);
            }
        }

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix2[i][j] = random.nextInt(boundForRand);
            }
        }






//        for (int[] i : matrix1) {
//            for (int j : i) {
//                System.out.println(j);
//            }
//        }
//        for (int[] i : matrix2) {
//            for (int j : i) {
//                System.out.println(j);
//            }
//        }




    }
}

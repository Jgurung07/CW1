
public class CW1P6 {

    static int[] average_grades(int grades[][], int weights[]) {

        int[] averages = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {

            int total = 0;

            for (int j = 0; j < weights.length; j++) {

                total += grades[i][j] * weights[j];
            }

            averages[i] = total / 100;
        }

        return averages;
    }

    public static void main(String[] args) {

        int[][] grades1 = {
            {51, 83, 28},
            {0, 38, 95}
        };

        int[] weights1 = {30, 40, 30};

        System.out.println(java.util.Arrays.toString(
            average_grades(grades1, weights1)));

        int[][] grades2 = {
            {0},
            {100},
            {17},
            {87}
        };

        int[] weights2 = {100};

        System.out.println(java.util.Arrays.toString(
            average_grades(grades2, weights2)));
    }
}

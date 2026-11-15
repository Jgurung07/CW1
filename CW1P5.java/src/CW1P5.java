
public class CW1P5 {

    static int countPeaks(int[][] grid) {

        int count = 0;

        int rows = grid.length;
        int cols = grid[0].length;

        for (int r = 0; r < rows; r++) {

            for (int c = 0; c < cols; c++) {

                int current = grid[r][c];

                boolean isPeak = true;

                // Check the cell above
                if (r > 0 && grid[r - 1][c] >= current) {
                    isPeak = false;
                }

                // Check the cell below
                if (r < rows - 1 && grid[r + 1][c] >= current) {
                    isPeak = false;
                }

                // Check the cell to the left
                if (c > 0 && grid[r][c - 1] >= current) {
                    isPeak = false;
                }

                // Check the cell to the right
                if (c < cols - 1 && grid[r][c + 1] >= current) {
                    isPeak = false;
                }

                if (isPeak) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(countPeaks(
            new int[][]{{1, 2, 1}, {2, 5, 2}, {1, 2, 1}}));

        System.out.println(countPeaks(
            new int[][]{{9, 3, 8}, {2, 1, 2}, {7, 4, 9}}));

        System.out.println(countPeaks(
            new int[][]{{4, 4, 4}, {4, 4, 4}}));

        System.out.println(countPeaks(
            new int[][]{{10}}));
    }
}

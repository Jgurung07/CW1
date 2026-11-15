
public class CW1P4 {

    static int longestPlateau(int[] terrain) {

        if (terrain == null || terrain.length < 4) {
            return 0;
        }

        int longest = 0;
        int i = 1;

        while (i < terrain.length - 1) {

            int start = i;

            // Find consecutive equal elevations
            while (i + 1 < terrain.length &&
                   terrain[i] == terrain[i + 1]) {
                i++;
            }

            int length = i - start + 1;

            // Check whether this is a valid plateau
            if (length >= 2 &&
                terrain[start] > terrain[start - 1] &&
                terrain[i] > terrain[i + 1]) {

                if (length > longest) {
                    longest = length;
                }
            }

            i++;
        }

        return longest;
    }

    public static void main(String[] args) {

        System.out.println(longestPlateau(
            new int[]{1, 3, 3, 3, 2, 1}));

        System.out.println(longestPlateau(
            new int[]{1, 2, 2, 1, 0, 4, 4, 4, 4, 2}));

        System.out.println(longestPlateau(
            new int[]{3, 3, 3, 2, 1}));

        System.out.println(longestPlateau(
            new int[]{1, 2, 3, 4, 5}));
    }
}


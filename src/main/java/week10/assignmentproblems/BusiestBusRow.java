public class BusiestBusRow {

   
    public static int[] busiestRow(int[][] grid) {
        int bestRow = 0;
        int bestTotal = -1;

        for (int row = 0; row < grid.length; row++) {
            int total = 0;

            for (int students : grid[row]) {
                total += students;
            }

            // Strictly larger keeps the smaller index when rows tie.
            if (total > bestTotal) {
                bestTotal = total;
                bestRow = row;
            }
        }

        return new int[]{bestRow, bestTotal};
    }

    public static void main(String[] args) {
        int[][] grid = {
            {2, 0, 1},
            {3, 3, 1},
            {1, 1, 1}
        };

        int[] result = busiestRow(grid);
        System.out.println("Row " + result[0] + ", Total " + result[1]);
    }
}
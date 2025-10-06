class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int topView = 0;
        int frontView = 0;
        int sideView = 0;

        for (int i = 0; i < n; i++) {
            int rowMax = 0;
            int colMax = 0;
            for (int j = 0; j < n; j++) {
                // Top view: count all cells with at least one cube
                if (grid[i][j] > 0) topView++;

                // Row max for front view
                rowMax = Math.max(rowMax, grid[i][j]);

                // Column max for side view
                colMax = Math.max(colMax, grid[j][i]);
            }
            frontView += rowMax;
            sideView += colMax;
        }

        return topView + frontView + sideView;
    }
}

class Solution {
    int rows, cols;
    int totalCells = 0;
    int result = 0;

    public int uniquePathsIII(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;

        int startX = 0, startY = 0;

        // Step 1: Count non-obstacle cells & find start
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] != -1) totalCells++;
                if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                }
            }
        }

        // Step 2: Start DFS
        dfs(grid, startX, startY, totalCells);

        return result;
    }

    private void dfs(int[][] grid, int x, int y, int remaining) {
        // Out of bounds or obstacle
        if (x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] == -1) {
            return;
        }

        // If reached end
        if (grid[x][y] == 2) {
            if (remaining == 1) result++;
            return;
        }

        // Mark visited
        int temp = grid[x][y];
        grid[x][y] = -1;

        // Explore 4 directions
        dfs(grid, x + 1, y, remaining - 1);
        dfs(grid, x - 1, y, remaining - 1);
        dfs(grid, x, y + 1, remaining - 1);
        dfs(grid, x, y - 1, remaining - 1);

        // Backtrack
        grid[x][y] = temp;
    }
}

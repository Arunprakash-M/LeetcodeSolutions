class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col < n; col++) {
                int minPathSum = matrix[row + 1][col];
                if (col > 0) {
                    minPathSum = Math.min(minPathSum, matrix[row + 1][col - 1]);
                }
                if (col < n - 1) {
                    minPathSum = Math.min(minPathSum, matrix[row + 1][col + 1]);
                }
                matrix[row][col] += minPathSum;
            }
        }
        int minFallingPathSum = Integer.MAX_VALUE;
        for (int col = 0; col < n; col++) {
            minFallingPathSum = Math.min(minFallingPathSum, matrix[0][col]);
        }
        return minFallingPathSum;
    }
}
class Solution {
    
    // 1. Run a loop 0-4 to check for every degree
    // 2. If matching return true 
    // 3. rotate (transpose+ reverse) and check again
    // 4. return false
     public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        // Try each of the four rotations
        for (int rotation = 0; rotation < 4; rotation++) {
            if (matches(mat, target)) {
                return true;
            }
            rotate90(mat); // Rotate mat by 90 degrees clockwise
        }
        return false;
    }
    
    // Helper function to check if two matrices are equal
    private boolean matches(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    // Rotate the matrix 90 degrees clockwise
    private void rotate90(int[][] mat) {
        int n = mat.length;
        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        // Reverse each row to complete the 90-degree clockwise rotation
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n - 1 - j];
                mat[i][n - 1 - j] = temp;
            }
        }
    }
}
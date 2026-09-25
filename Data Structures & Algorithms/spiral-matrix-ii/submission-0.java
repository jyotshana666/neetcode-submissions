class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        int num = 1;

        while(num <= n * n) {
            for(int col = left; col <= right; col++) {
                mat[top][col] = num++;
            }
            top++;

            for(int row = top; row <= bottom; row++) {
                mat[row][right] = num++;
            }
            right--;

            for(int col = right; col >= left; col--){
                mat[bottom][col] = num++;
            }
            bottom--;

            for(int row = bottom; row >= top; row--) {
                mat[row][left] = num++;
            }
            left++;
        }
        return mat;    
    }
}
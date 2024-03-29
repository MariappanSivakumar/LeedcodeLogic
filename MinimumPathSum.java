/*
Example 1:


Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
Output: 7
Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
Example 2:

Input: grid = [[1,2,3],[4,5,6]]
Output: 12
*/

class Solution {
    
    public int minPathSum(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        
        for(int i=1;i<m;i++){
            grid[i][0] = grid[i][0] + grid[i-1][0];
        }

        for(int i=1;i<n;i++){
            grid[0][i] = grid[0][i] + grid[0][i-1];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                grid[i][j] = Math.min( grid[i-1][j] + grid[i][j] , grid[i][j-1] + grid[i][j]);
            }
        }
        return grid[m-1][n-1];
    }
}

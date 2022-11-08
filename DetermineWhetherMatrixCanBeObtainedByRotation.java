/*
Example 1:


Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
Example 2:


Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
Output: false
Explanation: It is impossible to make mat equal to target by rotating mat.
Example 3:


Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.

*/

class Solution {
    public int[][] rotate90(int[][] mat)
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=i;j<mat[i].length;j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i=0;i<mat.length;i++)
        {
            int left = 0;
            int right = mat[i].length-1;
            while(left < right)
            {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp; 
                left++;
                right--;
            }
        }
        return mat;
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        if(java.util.Arrays.deepEquals(mat,target) ) return true;
        for(int i=0;i<3;i++)
        {
            mat = rotate90(mat);
            if(java.util.Arrays.deepEquals(mat,target))return true;
        }
        return false;
    }
}

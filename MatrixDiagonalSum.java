/*
Example 1:


Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
Example 2:

Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8
Example 3:

Input: mat = [[5]]
Output: 5
*/

class Solution {
    public int diagonalSum(int[][] mat) {
        int diagonalSumvalue=0, start=mat.length-1;
        for(int i=0 ; i< mat.length; i++)
        {
            diagonalSumvalue+=mat[i][i] + mat[i][start];
            start--;
        }
        if( mat.length%2 != 0 )
        diagonalSumvalue-=mat[mat.length/2][mat.length/2];
        return diagonalSumvalue;
    }
}
